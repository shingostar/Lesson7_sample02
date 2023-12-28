package jp.co.kiramex.company.entity;

public class Sales extends Employee {
    //  フィールド
    private String appointment;

    //コンストラクタ
    public Sales() {

    }

    //引数ありのコンストラクタ
    public Sales(int employeeId,String employeeName,int vitality) {
        super.setEmployeeId(employeeId);
        super.setEmployeeName(employeeName);
        super.setDivisionName("営業部");
        super.setVitality(vitality);
        this.appointment = "未定";
    }
    // 報告するメソッド
    public void report() {
        super.setVitality(super.getVitality() - 10);
        System.out.println("今日は10件アポイント取りました");
    }

    @Override
    //  挨拶するメソッド、スーパークラスのメソッドをオーバーライド
    public void greeting() {
        super.setVitality(getVitality()-10);
        System.out.println(super.getDivisionName()+"の皆さん+”おはようございます");
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }
}
