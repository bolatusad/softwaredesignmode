package zt.mode.prototypemode;

/**
 * ZhangTao
 * 2019/4/5 17:20
 * Description:
 */
public class OtherInfo implements Cloneable {

    private String adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "OtherInfo{" +
                "adress='" + adress + '\'' +
                '}';
    }
}
