public class Main {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.insertToBst(10);
        bst.insertToBst(5);
        bst.insertToBst(20);
        bst.insertToBst(6);
        bst.insertToBst(4);
        bst.insertToBst(15);
        bst.insertToBst(13);
        bst.insertToBst(16);
        bst.insertToBst(1);

        System.out.print("Before : ");
        bst.postOrder();
        System.out.println();

        if (bst.delete(bst.getRoot(),1)){
            System.out.println("Xóa ok");
        }else {
            System.out.println("Không xóa được");
        }
        System.out.print("After : ");
        bst.postOrder();
    }
}
