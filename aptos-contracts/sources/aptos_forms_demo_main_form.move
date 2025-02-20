// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module aptos_forms_demo::aptos_forms_demo_main_form {
    use aptos_forms_demo::aptos_forms_demo_genesis_account as genesis_account;
    use aptos_forms_demo::aptos_forms_demo_pass_object as pass_object;
    use aptos_framework::account;
    use aptos_framework::event;
    use aptos_std::table::{Self, Table};
    use std::string::String;
    use xrender_form_utils::date::Date;
    use xrender_form_utils::date_range::DateRange;
    use xrender_form_utils::time_range::TimeRange;
    friend aptos_forms_demo::aptos_forms_demo_main_form_submit_logic;
    friend aptos_forms_demo::aptos_forms_demo_main_form_update_logic;
    friend aptos_forms_demo::aptos_forms_demo_main_form_aggregate;

    const EIdAlreadyExists: u64 = 101;
    const EDataTooLong: u64 = 102;
    const EInappropriateVersion: u64 = 103;
    const ENotInitialized: u64 = 110;
    const EInvalidEnumValue: u64 = 106;

    struct Events has key {
        aptos_forms_demo_main_form_submitted_handle: event::EventHandle<AptosFormsDemoMainFormSubmitted>,
        aptos_forms_demo_main_form_updated_handle: event::EventHandle<AptosFormsDemoMainFormUpdated>,
    }

    struct Tables has key {
        aptos_forms_demo_main_form_table: Table<address, AptosFormsDemoMainForm>,
    }

    public fun initialize(account: &signer) {
        genesis_account::assert_genesis_account(account);

        let res_account = genesis_account::resource_account_signer();
        move_to(&res_account, Events {
            aptos_forms_demo_main_form_submitted_handle: account::new_event_handle<AptosFormsDemoMainFormSubmitted>(&res_account),
            aptos_forms_demo_main_form_updated_handle: account::new_event_handle<AptosFormsDemoMainFormUpdated>(&res_account),
        });

        move_to(
            &res_account,
            Tables {
                aptos_forms_demo_main_form_table: table::new(),
            },
        );

    }

    struct AptosFormsDemoMainForm has store {
        signer_address: address,
        version: u64,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: DateRange,
        fr_dy3l: DateRange,
        fr_6f68: u128,
        fr_47yy: TimeRange,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: Date,
        single_text1: String,
    }

    public fun signer_address(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): address {
        aptos_forms_demo_main_form.signer_address
    }

    public fun version(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): u64 {
        aptos_forms_demo_main_form.version
    }

    public fun fr_5pqi(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): u128 {
        aptos_forms_demo_main_form.fr_5pqi
    }

    public(friend) fun set_fr_5pqi(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, fr_5pqi: u128) {
        aptos_forms_demo_main_form.fr_5pqi = fr_5pqi;
    }

    public fun fr_duif(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): vector<String> {
        aptos_forms_demo_main_form.fr_duif
    }

    public(friend) fun set_fr_duif(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, fr_duif: vector<String>) {
        assert!(aptos_forms_demo::aptos_forms_demo_fr_duif::are_all_valid(&fr_duif), EInvalidEnumValue);
        aptos_forms_demo_main_form.fr_duif = fr_duif;
    }

    public fun fr_6i34(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): vector<String> {
        aptos_forms_demo_main_form.fr_6i34
    }

    public(friend) fun set_fr_6i34(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, fr_6i34: vector<String>) {
        assert!(aptos_forms_demo::aptos_forms_demo_fr_6i34::are_all_valid(&fr_6i34), EInvalidEnumValue);
        aptos_forms_demo_main_form.fr_6i34 = fr_6i34;
    }

    public fun fr_8xjs(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): String {
        aptos_forms_demo_main_form.fr_8xjs
    }

    public(friend) fun set_fr_8xjs(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, fr_8xjs: String) {
        assert!(std::string::length(&fr_8xjs) <= 255, EDataTooLong);
        aptos_forms_demo_main_form.fr_8xjs = fr_8xjs;
    }

    public fun fr_9c3f(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): String {
        aptos_forms_demo_main_form.fr_9c3f
    }

    public(friend) fun set_fr_9c3f(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, fr_9c3f: String) {
        assert!(std::string::length(&fr_9c3f) <= 1, EDataTooLong);
        assert!(aptos_forms_demo::aptos_forms_demo_fr_9c3f::is_valid(fr_9c3f), EInvalidEnumValue);
        aptos_forms_demo_main_form.fr_9c3f = fr_9c3f;
    }

    public fun fr_4ok6(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): u128 {
        aptos_forms_demo_main_form.fr_4ok6
    }

    public(friend) fun set_fr_4ok6(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, fr_4ok6: u128) {
        aptos_forms_demo_main_form.fr_4ok6 = fr_4ok6;
    }

    public fun fr_b3ub(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): String {
        aptos_forms_demo_main_form.fr_b3ub
    }

    public(friend) fun set_fr_b3ub(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, fr_b3ub: String) {
        assert!(std::string::length(&fr_b3ub) <= 255, EDataTooLong);
        aptos_forms_demo_main_form.fr_b3ub = fr_b3ub;
    }

    public fun fr_1z7o(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): u128 {
        aptos_forms_demo_main_form.fr_1z7o
    }

    public(friend) fun set_fr_1z7o(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, fr_1z7o: u128) {
        aptos_forms_demo_main_form.fr_1z7o = fr_1z7o;
    }

    public fun fr_d8rw(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): DateRange {
        aptos_forms_demo_main_form.fr_d8rw
    }

    public(friend) fun set_fr_d8rw(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, fr_d8rw: DateRange) {
        aptos_forms_demo_main_form.fr_d8rw = fr_d8rw;
    }

    public fun fr_dy3l(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): DateRange {
        aptos_forms_demo_main_form.fr_dy3l
    }

    public(friend) fun set_fr_dy3l(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, fr_dy3l: DateRange) {
        aptos_forms_demo_main_form.fr_dy3l = fr_dy3l;
    }

    public fun fr_6f68(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): u128 {
        aptos_forms_demo_main_form.fr_6f68
    }

    public(friend) fun set_fr_6f68(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, fr_6f68: u128) {
        aptos_forms_demo_main_form.fr_6f68 = fr_6f68;
    }

    public fun fr_47yy(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): TimeRange {
        aptos_forms_demo_main_form.fr_47yy
    }

    public(friend) fun set_fr_47yy(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, fr_47yy: TimeRange) {
        aptos_forms_demo_main_form.fr_47yy = fr_47yy;
    }

    public fun fr_gh3o(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): vector<String> {
        aptos_forms_demo_main_form.fr_gh3o
    }

    public(friend) fun set_fr_gh3o(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, fr_gh3o: vector<String>) {
        assert!(aptos_forms_demo::aptos_forms_demo_fr_gh3o::are_all_valid(&fr_gh3o), EInvalidEnumValue);
        aptos_forms_demo_main_form.fr_gh3o = fr_gh3o;
    }

    public fun fr_fbba(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): vector<String> {
        aptos_forms_demo_main_form.fr_fbba
    }

    public(friend) fun set_fr_fbba(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, fr_fbba: vector<String>) {
        assert!(aptos_forms_demo::aptos_forms_demo_fr_fbba::are_all_valid(&fr_fbba), EInvalidEnumValue);
        aptos_forms_demo_main_form.fr_fbba = fr_fbba;
    }

    public fun fr_hhzp(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): Date {
        aptos_forms_demo_main_form.fr_hhzp
    }

    public(friend) fun set_fr_hhzp(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, fr_hhzp: Date) {
        aptos_forms_demo_main_form.fr_hhzp = fr_hhzp;
    }

    public fun single_text1(aptos_forms_demo_main_form: &AptosFormsDemoMainForm): String {
        aptos_forms_demo_main_form.single_text1
    }

    public(friend) fun set_single_text1(aptos_forms_demo_main_form: &mut AptosFormsDemoMainForm, single_text1: String) {
        assert!(std::string::length(&single_text1) <= 50, EDataTooLong);
        aptos_forms_demo_main_form.single_text1 = single_text1;
    }

    fun new_aptos_forms_demo_main_form(
        signer_address: address,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: DateRange,
        fr_dy3l: DateRange,
        fr_6f68: u128,
        fr_47yy: TimeRange,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: Date,
        single_text1: String,
    ): AptosFormsDemoMainForm {
        assert!(aptos_forms_demo::aptos_forms_demo_fr_duif::are_all_valid(&fr_duif), EInvalidEnumValue);
        assert!(aptos_forms_demo::aptos_forms_demo_fr_6i34::are_all_valid(&fr_6i34), EInvalidEnumValue);
        assert!(std::string::length(&fr_8xjs) <= 255, EDataTooLong);
        assert!(std::string::length(&fr_9c3f) <= 1, EDataTooLong);
        assert!(aptos_forms_demo::aptos_forms_demo_fr_9c3f::is_valid(fr_9c3f), EInvalidEnumValue);
        assert!(std::string::length(&fr_b3ub) <= 255, EDataTooLong);
        assert!(aptos_forms_demo::aptos_forms_demo_fr_gh3o::are_all_valid(&fr_gh3o), EInvalidEnumValue);
        assert!(aptos_forms_demo::aptos_forms_demo_fr_fbba::are_all_valid(&fr_fbba), EInvalidEnumValue);
        assert!(std::string::length(&single_text1) <= 50, EDataTooLong);
        AptosFormsDemoMainForm {
            signer_address,
            version: 0,
            fr_5pqi,
            fr_duif,
            fr_6i34,
            fr_8xjs,
            fr_9c3f,
            fr_4ok6,
            fr_b3ub,
            fr_1z7o,
            fr_d8rw,
            fr_dy3l,
            fr_6f68,
            fr_47yy,
            fr_gh3o,
            fr_fbba,
            fr_hhzp,
            single_text1,
        }
    }

    struct AptosFormsDemoMainFormSubmitted has store, drop {
        signer_address: address,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: DateRange,
        fr_dy3l: DateRange,
        fr_6f68: u128,
        fr_47yy: TimeRange,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: Date,
        single_text1: String,
    }

    public fun aptos_forms_demo_main_form_submitted_signer_address(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): address {
        aptos_forms_demo_main_form_submitted.signer_address
    }

    public fun aptos_forms_demo_main_form_submitted_fr_5pqi(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): u128 {
        aptos_forms_demo_main_form_submitted.fr_5pqi
    }

    public fun aptos_forms_demo_main_form_submitted_fr_duif(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): vector<String> {
        aptos_forms_demo_main_form_submitted.fr_duif
    }

    public fun aptos_forms_demo_main_form_submitted_fr_6i34(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): vector<String> {
        aptos_forms_demo_main_form_submitted.fr_6i34
    }

    public fun aptos_forms_demo_main_form_submitted_fr_8xjs(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): String {
        aptos_forms_demo_main_form_submitted.fr_8xjs
    }

    public fun aptos_forms_demo_main_form_submitted_fr_9c3f(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): String {
        aptos_forms_demo_main_form_submitted.fr_9c3f
    }

    public fun aptos_forms_demo_main_form_submitted_fr_4ok6(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): u128 {
        aptos_forms_demo_main_form_submitted.fr_4ok6
    }

    public fun aptos_forms_demo_main_form_submitted_fr_b3ub(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): String {
        aptos_forms_demo_main_form_submitted.fr_b3ub
    }

    public fun aptos_forms_demo_main_form_submitted_fr_1z7o(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): u128 {
        aptos_forms_demo_main_form_submitted.fr_1z7o
    }

    public fun aptos_forms_demo_main_form_submitted_fr_d8rw(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): DateRange {
        aptos_forms_demo_main_form_submitted.fr_d8rw
    }

    public fun aptos_forms_demo_main_form_submitted_fr_dy3l(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): DateRange {
        aptos_forms_demo_main_form_submitted.fr_dy3l
    }

    public fun aptos_forms_demo_main_form_submitted_fr_6f68(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): u128 {
        aptos_forms_demo_main_form_submitted.fr_6f68
    }

    public fun aptos_forms_demo_main_form_submitted_fr_47yy(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): TimeRange {
        aptos_forms_demo_main_form_submitted.fr_47yy
    }

    public fun aptos_forms_demo_main_form_submitted_fr_gh3o(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): vector<String> {
        aptos_forms_demo_main_form_submitted.fr_gh3o
    }

    public fun aptos_forms_demo_main_form_submitted_fr_fbba(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): vector<String> {
        aptos_forms_demo_main_form_submitted.fr_fbba
    }

    public fun aptos_forms_demo_main_form_submitted_fr_hhzp(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): Date {
        aptos_forms_demo_main_form_submitted.fr_hhzp
    }

    public fun aptos_forms_demo_main_form_submitted_single_text1(aptos_forms_demo_main_form_submitted: &AptosFormsDemoMainFormSubmitted): String {
        aptos_forms_demo_main_form_submitted.single_text1
    }

    public(friend) fun new_aptos_forms_demo_main_form_submitted(
        signer_address: address,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: DateRange,
        fr_dy3l: DateRange,
        fr_6f68: u128,
        fr_47yy: TimeRange,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: Date,
        single_text1: String,
    ): AptosFormsDemoMainFormSubmitted {
        AptosFormsDemoMainFormSubmitted {
            signer_address,
            fr_5pqi,
            fr_duif,
            fr_6i34,
            fr_8xjs,
            fr_9c3f,
            fr_4ok6,
            fr_b3ub,
            fr_1z7o,
            fr_d8rw,
            fr_dy3l,
            fr_6f68,
            fr_47yy,
            fr_gh3o,
            fr_fbba,
            fr_hhzp,
            single_text1,
        }
    }

    struct AptosFormsDemoMainFormUpdated has store, drop {
        signer_address: address,
        version: u64,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: DateRange,
        fr_dy3l: DateRange,
        fr_6f68: u128,
        fr_47yy: TimeRange,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: Date,
        single_text1: String,
    }

    public fun aptos_forms_demo_main_form_updated_signer_address(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): address {
        aptos_forms_demo_main_form_updated.signer_address
    }

    public fun aptos_forms_demo_main_form_updated_fr_5pqi(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): u128 {
        aptos_forms_demo_main_form_updated.fr_5pqi
    }

    public fun aptos_forms_demo_main_form_updated_fr_duif(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): vector<String> {
        aptos_forms_demo_main_form_updated.fr_duif
    }

    public fun aptos_forms_demo_main_form_updated_fr_6i34(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): vector<String> {
        aptos_forms_demo_main_form_updated.fr_6i34
    }

    public fun aptos_forms_demo_main_form_updated_fr_8xjs(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): String {
        aptos_forms_demo_main_form_updated.fr_8xjs
    }

    public fun aptos_forms_demo_main_form_updated_fr_9c3f(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): String {
        aptos_forms_demo_main_form_updated.fr_9c3f
    }

    public fun aptos_forms_demo_main_form_updated_fr_4ok6(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): u128 {
        aptos_forms_demo_main_form_updated.fr_4ok6
    }

    public fun aptos_forms_demo_main_form_updated_fr_b3ub(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): String {
        aptos_forms_demo_main_form_updated.fr_b3ub
    }

    public fun aptos_forms_demo_main_form_updated_fr_1z7o(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): u128 {
        aptos_forms_demo_main_form_updated.fr_1z7o
    }

    public fun aptos_forms_demo_main_form_updated_fr_d8rw(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): DateRange {
        aptos_forms_demo_main_form_updated.fr_d8rw
    }

    public fun aptos_forms_demo_main_form_updated_fr_dy3l(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): DateRange {
        aptos_forms_demo_main_form_updated.fr_dy3l
    }

    public fun aptos_forms_demo_main_form_updated_fr_6f68(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): u128 {
        aptos_forms_demo_main_form_updated.fr_6f68
    }

    public fun aptos_forms_demo_main_form_updated_fr_47yy(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): TimeRange {
        aptos_forms_demo_main_form_updated.fr_47yy
    }

    public fun aptos_forms_demo_main_form_updated_fr_gh3o(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): vector<String> {
        aptos_forms_demo_main_form_updated.fr_gh3o
    }

    public fun aptos_forms_demo_main_form_updated_fr_fbba(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): vector<String> {
        aptos_forms_demo_main_form_updated.fr_fbba
    }

    public fun aptos_forms_demo_main_form_updated_fr_hhzp(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): Date {
        aptos_forms_demo_main_form_updated.fr_hhzp
    }

    public fun aptos_forms_demo_main_form_updated_single_text1(aptos_forms_demo_main_form_updated: &AptosFormsDemoMainFormUpdated): String {
        aptos_forms_demo_main_form_updated.single_text1
    }

    public(friend) fun new_aptos_forms_demo_main_form_updated(
        aptos_forms_demo_main_form: &AptosFormsDemoMainForm,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: DateRange,
        fr_dy3l: DateRange,
        fr_6f68: u128,
        fr_47yy: TimeRange,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: Date,
        single_text1: String,
    ): AptosFormsDemoMainFormUpdated {
        AptosFormsDemoMainFormUpdated {
            signer_address: signer_address(aptos_forms_demo_main_form),
            version: version(aptos_forms_demo_main_form),
            fr_5pqi,
            fr_duif,
            fr_6i34,
            fr_8xjs,
            fr_9c3f,
            fr_4ok6,
            fr_b3ub,
            fr_1z7o,
            fr_d8rw,
            fr_dy3l,
            fr_6f68,
            fr_47yy,
            fr_gh3o,
            fr_fbba,
            fr_hhzp,
            single_text1,
        }
    }


    public(friend) fun create_aptos_forms_demo_main_form(
        signer_address: address,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: DateRange,
        fr_dy3l: DateRange,
        fr_6f68: u128,
        fr_47yy: TimeRange,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: Date,
        single_text1: String,
    ): AptosFormsDemoMainForm acquires Tables {
        asset_aptos_forms_demo_main_form_not_exists(signer_address);
        let aptos_forms_demo_main_form = new_aptos_forms_demo_main_form(
            signer_address,
            fr_5pqi,
            fr_duif,
            fr_6i34,
            fr_8xjs,
            fr_9c3f,
            fr_4ok6,
            fr_b3ub,
            fr_1z7o,
            fr_d8rw,
            fr_dy3l,
            fr_6f68,
            fr_47yy,
            fr_gh3o,
            fr_fbba,
            fr_hhzp,
            single_text1,
        );
        aptos_forms_demo_main_form
    }

    public(friend) fun asset_aptos_forms_demo_main_form_not_exists(
        signer_address: address,
    ) acquires Tables {
        assert!(exists<Tables>(genesis_account::resource_account_address()), ENotInitialized);
        let tables = borrow_global_mut<Tables>(genesis_account::resource_account_address());
        assert!(!table::contains(&tables.aptos_forms_demo_main_form_table, signer_address), EIdAlreadyExists);
    }

    public(friend) fun update_version_and_add(aptos_forms_demo_main_form: AptosFormsDemoMainForm) acquires Tables {
        aptos_forms_demo_main_form.version = aptos_forms_demo_main_form.version + 1;
        //assert!(aptos_forms_demo_main_form.version != 0, EInappropriateVersion);
        private_add_aptos_forms_demo_main_form(aptos_forms_demo_main_form);
    }

    public(friend) fun add_aptos_forms_demo_main_form(aptos_forms_demo_main_form: AptosFormsDemoMainForm) acquires Tables {
        assert!(aptos_forms_demo_main_form.version == 0, EInappropriateVersion);
        private_add_aptos_forms_demo_main_form(aptos_forms_demo_main_form);
    }

    public(friend) fun remove_aptos_forms_demo_main_form(signer_address: address): AptosFormsDemoMainForm acquires Tables {
        assert!(exists<Tables>(genesis_account::resource_account_address()), ENotInitialized);
        let tables = borrow_global_mut<Tables>(genesis_account::resource_account_address());
        table::remove(&mut tables.aptos_forms_demo_main_form_table, signer_address)
    }

    fun private_add_aptos_forms_demo_main_form(aptos_forms_demo_main_form: AptosFormsDemoMainForm) acquires Tables {
        assert!(exists<Tables>(genesis_account::resource_account_address()), ENotInitialized);
        let tables = borrow_global_mut<Tables>(genesis_account::resource_account_address());
        table::add(&mut tables.aptos_forms_demo_main_form_table, aptos_forms_demo_main_form.signer_address, aptos_forms_demo_main_form);
    }

    public fun get_aptos_forms_demo_main_form(signer_address: address): pass_object::PassObject<AptosFormsDemoMainForm> acquires Tables {
        let aptos_forms_demo_main_form = remove_aptos_forms_demo_main_form(signer_address);
        pass_object::new(aptos_forms_demo_main_form)
    }

    public fun return_aptos_forms_demo_main_form(aptos_forms_demo_main_form_pass_obj: pass_object::PassObject<AptosFormsDemoMainForm>) acquires Tables {
        let aptos_forms_demo_main_form = pass_object::extract(aptos_forms_demo_main_form_pass_obj);
        private_add_aptos_forms_demo_main_form(aptos_forms_demo_main_form);
    }

    public(friend) fun drop_aptos_forms_demo_main_form(aptos_forms_demo_main_form: AptosFormsDemoMainForm) {
        let AptosFormsDemoMainForm {
            version: _version,
            signer_address: _signer_address,
            fr_5pqi: _fr_5pqi,
            fr_duif: _fr_duif,
            fr_6i34: _fr_6i34,
            fr_8xjs: _fr_8xjs,
            fr_9c3f: _fr_9c3f,
            fr_4ok6: _fr_4ok6,
            fr_b3ub: _fr_b3ub,
            fr_1z7o: _fr_1z7o,
            fr_d8rw: _fr_d8rw,
            fr_dy3l: _fr_dy3l,
            fr_6f68: _fr_6f68,
            fr_47yy: _fr_47yy,
            fr_gh3o: _fr_gh3o,
            fr_fbba: _fr_fbba,
            fr_hhzp: _fr_hhzp,
            single_text1: _single_text1,
        } = aptos_forms_demo_main_form;
    }

    public fun contains_aptos_forms_demo_main_form(signer_address: address): bool acquires Tables {
        let tables = borrow_global<Tables>(genesis_account::resource_account_address());
        table::contains(&tables.aptos_forms_demo_main_form_table, signer_address)
    }

    public(friend) fun emit_aptos_forms_demo_main_form_submitted(aptos_forms_demo_main_form_submitted: AptosFormsDemoMainFormSubmitted) acquires Events {
        assert!(exists<Events>(genesis_account::resource_account_address()), ENotInitialized);
        let events = borrow_global_mut<Events>(genesis_account::resource_account_address());
        event::emit_event(&mut events.aptos_forms_demo_main_form_submitted_handle, aptos_forms_demo_main_form_submitted);
    }

    public(friend) fun emit_aptos_forms_demo_main_form_updated(aptos_forms_demo_main_form_updated: AptosFormsDemoMainFormUpdated) acquires Events {
        assert!(exists<Events>(genesis_account::resource_account_address()), ENotInitialized);
        let events = borrow_global_mut<Events>(genesis_account::resource_account_address());
        event::emit_event(&mut events.aptos_forms_demo_main_form_updated_handle, aptos_forms_demo_main_form_updated);
    }

}
