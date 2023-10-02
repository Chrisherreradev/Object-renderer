public class Main {
    public static void main(String[] args) {
        ObjectRenderer renderer = new ObjectRenderer();

        int[] D1 = {5,11,1,3};
        int[] C1 = {6,1,3,2};
        int P1 = 7;

        int[] D2 = {10,15,1};
        int[] C2 = {10,1,2};
        int P2 = 3;

        int[] D3 = {5,5,5,5,};
        int[] C3 = {8,3,3,4};
        int P3 = 6;

        int[] D4 = {11,18,1};
        int[] C4 = {9,18,8};
        int P4 = 7;

        int[] D5 = {1,4,2,5};
        int[] C5 = {4,9,2,3};
        int P5 = 19;

        int[] D6 = {5,7,3,5};
        int[] C6 = {1,3,4,9,8,6};
        int P6 = 7;

        System.out.println(renderer.solution(D1,C1,P1)); //Expect 2
        System.out.println(renderer.solution(D2,C2,P2)); // Expect 1
        System.out.println(renderer.solution(D3,C3,P3)); // Expect 2
        System.out.println(renderer.solution(D4,C4,P4)); // Expect 0
        System.out.println(renderer.solution(D5,C5,P5)); // Expect 4
        System.out.println(renderer.solution(D6,C6,P6)); // Expect 3?
    }

}