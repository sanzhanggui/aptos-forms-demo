# README

## Prerequisites

Currently, the dddappp low-code tool is published as a Docker image for developers to experience.

The off-chain services generated by the tool are written in Java and use the MySQL database by default.

So before getting started, you need to:

* Install [Aptos CLI](https://aptos.dev/tools/install-cli/).
* Install [Docker](https://docs.docker.com/engine/install/).
* Install `curl`.
* ~~(Optional) Install `jp` - commandline JSON processor. We can use `jp` to process Node API returned JSON results when testing contracts.~~
* Install MySQL database server. If you do not want to try to run the off-chain service, you can ignore this step.
* Install JDK and Maven. If you do not want to try to run the off-chain service, you can ignore this step. The off-chain services generated by the tool currently use Java language.

If you have already installed Docker, you can use Docker to run a MySQL database service. For example:

```shell
sudo docker run -p 3306:3306 --name mysql \
-v ~/docker/mysql/conf:/etc/mysql \
-v ~/docker/mysql/logs:/var/log/mysql \
-v ~/docker/mysql/data:/var/lib/mysql \
-e MYSQL_ROOT_PASSWORD=123456 \
-d mysql:5.7
```

## Programming

We use the following XRender form schema to generate the DDDML model file.

```json
{
  "type": "object",
  "properties": {
    "fr-5pqi": {
      "title": "数字输入框",
      "type": "number",
      "widget": "inputNumber"
    },
    "fr-duif": {
      "title": "下拉多选",
      "type": "array",
      "widget": "multiSelect",
      "props": {
        "options": [
          {
            "label": "A",
            "value": "A"
          },
          {
            "label": "B",
            "value": "B"
          }
        ],
        "placeholder": "请选择"
      }
    },
    "fr-6i34": {
      "title": "点击多选",
      "type": "array",
      "props": {
        "options": [
          {
            "label": "A",
            "value": "A"
          },
          {
            "label": "B",
            "value": "B"
          },
          {
            "label": "C",
            "value": "C"
          }
        ],
        "direction": "row"
      },
      "widget": "checkboxes"
    },
    "fr-8xjs": {
      "title": "单行文本",
      "type": "string",
      "pattern": "^[A-Za-z0-9]+$",
      "widget": "input"
    },
    "fr-9c3f": {
      "title": "下拉单选",
      "type": "string",
      "props": {
        "options": [
          {
            "label": "A",
            "value": "1"
          },
          {
            "label": "B",
            "value": "2"
          },
          {
            "label": "C",
            "value": "3"
          }
        ],
        "placeholder": "请选择"
      },
      "widget": "select"
    },
    "fr-4ok6": {
      "title": "数字输入框",
      "type": "number",
      "props": {
        "prefix": "x",
        "addonBefore": "y",
        "addonAfter": "z",
        "precision": 2
      },
      "widget": "inputNumber"
    },
    "fr-b3ub": {
      "title": "Html",
      "default": "<h1>Hello</h1>",
      "widget": "html"
    },
    "fr-1z7o": {
      "title": "滑动条",
      "min": 1,
      "max": 10,
      "maxWidth": "340px",
      "widget": "slider"
    },
    "fr-d8rw": {
      "title": "日期区间选择",
      "type": "range",
      "format": "date",
      "props": {
        "placeholder": [
          "开始时间",
          "结束时间"
        ]
      },
      "maxWidth": "340px",
      "widget": "dateRange"
    },
    "fr-dy3l": {
      "title": "日期区间选择",
      "type": "range",
      "format": "date",
      "props": {
        "placeholder": [
          "开始时间",
          "结束时间"
        ]
      },
      "widget": "dateRange"
    },
    "fr-6f68": {
      "title": "评分",
      "props": {
        "allowClear": true,
        "count": 19
      },
      "widget": "rate"
    },
    "fr-47yy": {
      "title": "时间区间",
      "type": "range",
      "format": "time",
      "props": {
        "placeholder": [
          "开始时间",
          "结束时间"
        ]
      },
      "maxWidth": "340px",
      "widget": "timeRange"
    },
    "fr-gh3o": {
      "title": "下拉多选",
      "type": "array",
      "widget": "multiSelect",
      "props": {
        "options": [
          {
            "label": "A",
            "value": "A"
          },
          {
            "label": "B",
            "value": "B"
          }
        ],
        "placeholder": "请选择"
      }
    },
    "fr-fbba": {
      "title": "点击多选",
      "type": "array",
      "props": {
        "options": [
          {
            "label": "A",
            "value": "1"
          },
          {
            "label": "B",
            "value": "2"
          },
          {
            "label": "C",
            "value": "3"
          }
        ],
        "direction": "row"
      },
      "maxWidth": "340px",
      "widget": "checkboxes"
    },
    "fr-hhzp": {
      "title": "日期选择",
      "type": "string",
      "props": {
        "placeholder": "请选择日期"
      },
      "widget": "datePicker"
    },
    "single_text1": {
      "title": "单行文本",
      "type": "string",
      "format": "email",
      "widget": "input"
    }
  },
  "displayType": "row",
  "maxWidth": "340px"
}
```

The generated model file is available at `. /dddml/forms.yaml`.


### Run dddappp Project Creation Tool

#### Update dddappp Docker Image

Since the dddappp v0.0.1 image is updated frequently, you may be required to manually delete the image and pull it again before `docker run`.

```shell
# If you have already run it, you may need to Clean Up Exited Docker Containers first
docker rm $(docker ps -aq --filter "ancestor=wubuku/dddappp-aptos:0.0.1")
# remove the image
docker image rm wubuku/dddappp-aptos:0.0.1
# pull the image
git pull wubuku/dddappp-aptos:0.0.1
```

---

In repository root directory, run:

```shell
docker run \
-v .:/myapp \
wubuku/dddappp-aptos:0.0.1 \
--dddmlDirectoryPath /myapp/dddml \
--boundedContextName Test.AptosFormsDemo \
--aptosMoveProjectDirectoryPath /myapp/aptos-contracts \
--boundedContextAptosPackageName AptosFormsDemo \
--boundedContextAptosNamedAddress aptos_forms_demo \
--boundedContextJavaPackageName org.test.aptosformsdemo \
--javaProjectsDirectoryPath /myapp/aptos-java-service \
--javaProjectNamePrefix aptosformsdemo \
--pomGroupId test.aptosformsdemo
```


## Test Example

### Compile Aptos Move contracts

#### Some preparatory work that may need to be done

It should be noted that below we assume that you will publish the Move contract to the Aptos devnet, so we skip the explanation of the modifications to some configuration files required for publishing to other networks.

We can create a new account on devnet to perform the following test.

Confirm that Aptos CLI is installed and enter the directory `aptos-contracts`, then run:

```shell
aptos init
# Press Enter to confirm using the default values:
aptos account fund-with-faucet --account default --amount 50000000000
# View Aptos Profiles:
aptos config show-profiles
```

It should display similar information:

```shell
{
  "Result": {
    "default": {
      "has_private_key": true,
      "public_key": "...",
      "account": "{ACCOUNT_ADDRESS}",
      "rest_url": "https://fullnode.devnet.aptoslabs.com",
      "faucet_url": "https://faucet.devnet.aptoslabs.com"
    }
  }
}
```

---

In the directory `aptos-contracts`, execute the compilation, which should now succeed:

```shell
aptos move compile --named-addresses aptos_forms_demo=default
```

At this point, the coding phase of the application development is complete! Isn't it very simple?

---

Next, we will deploy and test the Demo application.

### Publish the Aptos contracts

Execute the following command in the directory `aptos-contracts` to publish the contracts to the chain:

```shell
aptos move publish --named-addresses aptos_forms_demo=default --assume-yes
```

If the command is executed successfully, it should display similar information:

```shell
{
  "Result": {
    "transaction_hash": "{TRANSACTION_HASH}"
    "gas_used": 20722,
    "gas_unit_price": 100,
    "sender": "{ACCOUNT_ADDRESS}",
    "sequence_number": 0,
    "success": true,
    "timestamp_us": 1688909362156606,
    "version": 11446005,
    "vm_status": "Executed successfully"
  }
}
```

Initialize the contract first:

```shell
aptos move run --function-id 'default::aptos_forms_demo_init::initialize' --assume-yes
```

### Tip: Using this Cheatsheet

Here it is a cheatsheet on how to use the Aptos Client CLI to call on-chain contracts: [AptosMoveCLICheatsheet](./aptos-contracts/AptosMoveCLICheatsheet.md)

The parameters you need to fill in are placeholders containing their type and meaning (name). You can copy these commands, modify them as needed, and execute them directly in a terminal.

