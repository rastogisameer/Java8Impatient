package chap1;

public class MutableString {
    private String s;
    public MutableString(String s){
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MutableString that = (MutableString) o;

        return s != null ? s.equals(that.s) : that.s == null;
    }

    @Override
    public String toString() {
        return "MutableString{" +
                "s='" + s + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return s != null ? s.hashCode() : 0;
    }

    public String getS() {

        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
