jetbrains://idea/navigate/reference?project=TugasPBO4_Gagas3F&fqn=Bangun_Ruang.bangunRuang
C:\Users\USER\IdeaProjects\TugasPBO4_Gagas3F\src\Bangun_Ruang\bangunRuang.java
  package Bangun_Ruang;

public class bangunRuang {
    double p, l, t, s;

    public bangunRuang(double l, double p, double t) {
        this.l = l;
        this.p = p;
        this.t = t;
    }

    public bangunRuang(double s) {
        this.s = s;
    }

    public double VolumeKubus() {
        return s * s * s;
    }

    public double LuasPermukaanKubus() {
        return 6 * s * s ;
    }

    public double VolumeBalok() {
        return l * p * t;
    }

    public double LuasPermukaanBalok() {
        return ( 2 * ( p * l ) + ( p * t ) + ( l * t ));
    }
}
