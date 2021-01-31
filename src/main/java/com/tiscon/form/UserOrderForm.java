package com.tiscon.form;

import com.tiscon.validator.Numeric;

import javax.validation.constraints.*;

/**
 * 顧客が入力する見積もり情報を保持するクラス。
 *
 * @author Oikawa Yumi
 */
public class UserOrderForm {

    @NotBlank(message = "氏名が入力されていません")
    private String customerName;

    @NotBlank(message = "連絡先TELが入力されていません")
    //@Numeric(message = "連絡先TELが半角数値で入力されていません")
    @Pattern(regexp = "^\\d{1,5}-?\\d{1,5}-?\\d{4}$", message = "電話番号の形式で入力してください")
    private String tel;

    @Email
    @NotBlank(message = "連絡先メールアドレスが入力されていません")
    private String email;

    @NotBlank
    private String oldPrefectureId;

    @NotBlank(message = "転居元住所（市区町村以下）が入力されていません")
    private String oldAddress;

    @NotBlank
    private String newPrefectureId;

    @NotBlank(message = "転居先住所（市区町村以下）が入力されていません")
    private String newAddress;

    @Numeric(message = "月は半角数字で入力してください")
    @NotBlank(message = "月を入力してください")
    private String month;

    @Numeric(message = "段ボールの個数は半角数字で入力してください")
    private String day;

    @Numeric(message = "段ボールの個数は数字で入力してください")
    @NotBlank(message = "段ボールの個数が入力されていません")
    private String box;

    @Numeric(message = "ベッドの個数は半角数字で入力してください")
    @NotBlank(message = "ベッドの個数が入力されていません")
    private String bed;

    @Numeric(message = "自転車の個数は半角数字で入力してください")
    @NotBlank(message = "自転車の個数が入力されていません")
    private String bicycle;

    @Numeric(message = "洗濯機の個数は半角数字で入力してください")
    @NotBlank(message = "洗濯機の個数が入力されていません")
    private String washingMachine;

    @NotNull
    private boolean washingMachineInstallation;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBicycle() {
        return bicycle;
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public String getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean getWashingMachineInstallation() {
        return washingMachineInstallation;
    }

    public void setWashingMachineInstallation(boolean washingMachineInstallation) {
        this.washingMachineInstallation = washingMachineInstallation;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
