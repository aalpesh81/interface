/**
 * Created by alpesh_savani on 08/12/2016.
 */
interface Pet{
        public void test();
        public void eat();
}
    class Dog implements Pet{
        public void eat(){
            System.out.println("Interface Method-1 Implemented");
        }
        public void test(){
            System.out.println("Interface Method-2 Implemented");
        }
        public static void main(String args[]){
            Pet p = new Dog();
            p.test();
            p.eat();
        }
    }

