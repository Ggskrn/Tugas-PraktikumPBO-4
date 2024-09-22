jetbrains://idea/navigate/reference?project=TugasPBO4_Gagas3F&fqn=Bangun_Ruang.bangunRuangDemo
C:\Users\USER\IdeaProjects\TugasPBO4_Gagas3F\src\Bangun_Ruang\bangunRuangDemo.java
  package Bangun_Ruang;

public class bangunRuangDemo {
    public static void main(String[] args) {
        bangunRuang br = new bangunRuang(3, 9, 12);
        bangunRuang br1 = new bangunRuang(9);
        bangunRuang bx = new bangunRuang(21, 108, 36);
        bangunRuang bx2 = new bangunRuang (2);
        System.out.println("Volume Kubus : " + br1.VolumeKubus() + "cm^3");
        System.out.println("Luas Permukaan Kubus : " + bx2.LuasPermukaanKubus() + "cm^2");
        System.out.println("");
        System.out.println("Volume Balok : " + br.VolumeBalok() + "cm^3");
        System.out.println("Luas Permukaan Balok : " + bx.LuasPermukaanBalok() + "cm^2");
        System.out.println("");

        ///NOTE : nilai bx adalah jumlah dari 2(p*l)+(p*l)+(l*t)

    }
}
