class Programm {
    public static void main(String[] args){
        Uhr uhr = new Uhr(10, 5, 5);
        System.out.printf("%d\n", uhr.nehmenStunden());
        uhr.setzenStunden(24);
        System.out.printf("%d\n", uhr.nehmenStunden());


        System.out.printf("%s\n", uhr.nehmenSpat());
    }
}
