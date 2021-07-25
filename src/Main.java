public class Main {
    public static void main(String[] args){
//        System.out.println("Xin chào");
//
//        int a = 5;
//        int b = 10;
//
//        int ketqua = a++ - --b + b-- + a++;
//        // 5- --b + b-- + a++  // a = 6 , b = 10;
//
//        System.out.println(ketqua);


        // số 4 . câu điều kiện

//        int a = 5;
//        int b = 10;
//
//        if(a > b ) {
//            System.out.println(" 1 ");
//        } else if (a == b){
//            System.out.println(" 0 ");
//        } else {
//            System.out.println(" -1 ");
//        }

//        String username = "đffg5515";
//        String password = "fdfd656556";
//
//        // láy kích thước chuỗi : .length()
//
//        if(username.length() >=6 && username.length() >6  ){
//            System.out.println(" Login success ");
//        } else {
//            System.out.println(" Invalid Login ");
//        }


        // a > b => 1
        // a == b => 0
        // a < b => -1
        int a = 10;
        int b = 5;


//        if (a > b){
//            System.out.println(" A lớn hơn B ");
//        } else {
//            System.out.println("A sẽ bé hơn B ");
//        }



//          (biểu thức ) ? giá trị cho trường hợp true : giá trị cho trường hợp là false

//        String message = (a > b) ? " A lớn hơn B " : " A bé hơn B ";
//
//        System.out.println(message);

// a > b => 1
// a == b => 0
// a < b => -1

//        int ketqua = (a > b ) ?  1  : ((a == b ) ? 0 : -1 );
//
//        System.out.println(ketqua);

        // Bài Tập tính BMI



        // B3 = Tính BMI
        // B4 = Điều kiện sét gầy hay lá óm

        // B1 = Nhập cân nặng
        float weight = 50.2f;

        // B2 = Nhập chiều cao
        float height = 1.75f;

        // B3 = Tính BMI
        double bMI = weight /  (height * 2) ;

        if(bMI <= 18.5 ){
            System.out.println(" Thì Ban Gầy ");
        } else if (bMI > 18.5  &&   bMI <= 24.9 ){
            System.out.println(" Thì bạn Bình Thường ");
        } else if ( bMI > 25   &&   bMI <= 29.9 ){
            System.out.println(" Thì Bạn Béo ");
        } else if( bMI > 30    &&   bMI <= 34.9 ){
            System.out.println(" Thì Bạn Béo Phì Cấp Độ 1");
        } else if ( bMI > 35   &&   bMI <= 39.9 ){
            System.out.println(" Thì Bạn Béo Phì Cấp Độ 2");
        } else if( bMI > 40 ) {
            System.out.println(" Thì Bạn Béo Phì Cấp Độ 3 ");
        }







    }

}
