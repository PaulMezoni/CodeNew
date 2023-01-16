package packed;

public class InitialLoader {
    static {
        System.out.println("{верхний static block}");
    }


    public static void main(String[] args) {

        Init.InnerInitClass innerInitClass = new Init.InnerInitClass();
        Init init = new Init();
    }

    static class Init {

        {
            System.out.println("{анонимный блок InitClass}");
        }

        Init() {
            System.out.println("constructor Init class");
        }

        static {
            System.out.println("static {block InitClass}");
        }

        static class InnerInitClass extends Init {
            {
                System.out.println("анонимный блок InnerInitClass");
            }

            InnerInitClass() {
                System.out.println("constructor InnerInitClass");
            }

            static {
                System.out.println("static {block InnerInitClass}");
            }
        }
    }
}
