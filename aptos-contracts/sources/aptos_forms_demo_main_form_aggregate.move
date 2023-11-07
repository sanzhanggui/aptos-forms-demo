// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module aptos_forms_demo::aptos_forms_demo_main_form_aggregate {
    use aptos_forms_demo::aptos_forms_demo_main_form;
    use aptos_forms_demo::aptos_forms_demo_main_form_submit_logic;
    use aptos_forms_demo::aptos_forms_demo_main_form_update_logic;
    use std::string::String;

    public entry fun submit(
        account: &signer,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: vector<u16>,
        fr_dy3l: vector<u16>,
        fr_6f68: u128,
        fr_47yy: vector<u8>,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: vector<u16>,
        single_text1: String,
    ) {
        let aptos_forms_demo_main_form_submitted = aptos_forms_demo_main_form_submit_logic::verify(
            account,
            fr_5pqi,
            fr_duif,
            fr_6i34,
            fr_8xjs,
            fr_9c3f,
            fr_4ok6,
            fr_b3ub,
            fr_1z7o,
            xrender_form_utils::date_range::value_of(fr_d8rw),
            xrender_form_utils::date_range::value_of(fr_dy3l),
            fr_6f68,
            xrender_form_utils::time_range::value_of(fr_47yy),
            fr_gh3o,
            fr_fbba,
            xrender_form_utils::date::value_of(fr_hhzp),
            single_text1,
        );
        let aptos_forms_demo_main_form = aptos_forms_demo_main_form_submit_logic::mutate(
            account,
            &aptos_forms_demo_main_form_submitted,
        );
        aptos_forms_demo_main_form::add_aptos_forms_demo_main_form(aptos_forms_demo_main_form);
        aptos_forms_demo_main_form::emit_aptos_forms_demo_main_form_submitted(aptos_forms_demo_main_form_submitted);
    }

    public entry fun update(
        account: &signer,
        signer_address: address,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: vector<u16>,
        fr_dy3l: vector<u16>,
        fr_6f68: u128,
        fr_47yy: vector<u8>,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: vector<u16>,
        single_text1: String,
    ) {
        let aptos_forms_demo_main_form = aptos_forms_demo_main_form::remove_aptos_forms_demo_main_form(signer_address);
        let aptos_forms_demo_main_form_updated = aptos_forms_demo_main_form_update_logic::verify(
            account,
            fr_5pqi,
            fr_duif,
            fr_6i34,
            fr_8xjs,
            fr_9c3f,
            fr_4ok6,
            fr_b3ub,
            fr_1z7o,
            xrender_form_utils::date_range::value_of(fr_d8rw),
            xrender_form_utils::date_range::value_of(fr_dy3l),
            fr_6f68,
            xrender_form_utils::time_range::value_of(fr_47yy),
            fr_gh3o,
            fr_fbba,
            xrender_form_utils::date::value_of(fr_hhzp),
            single_text1,
            &aptos_forms_demo_main_form,
        );
        let updated_aptos_forms_demo_main_form = aptos_forms_demo_main_form_update_logic::mutate(
            account,
            &aptos_forms_demo_main_form_updated,
            aptos_forms_demo_main_form,
        );
        aptos_forms_demo_main_form::update_version_and_add(updated_aptos_forms_demo_main_form);
        aptos_forms_demo_main_form::emit_aptos_forms_demo_main_form_updated(aptos_forms_demo_main_form_updated);
    }

}
