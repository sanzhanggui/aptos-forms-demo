// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemomainform;

import java.util.*;
import java.math.BigInteger;
import org.test.aptosformsdemo.domain.*;
import java.util.Date;
import org.test.aptosformsdemo.domain.AbstractCommand;

public abstract class AbstractAptosFormsDemoMainFormCommand extends AbstractCommand implements AptosFormsDemoMainFormCommand {

    private String signerAddress;

    public String getSignerAddress()
    {
        return this.signerAddress;
    }

    public void setSignerAddress(String signerAddress)
    {
        this.signerAddress = signerAddress;
    }

    private Long offChainVersion;

    public Long getOffChainVersion()
    {
        return this.offChainVersion;
    }

    public void setOffChainVersion(Long offChainVersion)
    {
        this.offChainVersion = offChainVersion;
    }


}
