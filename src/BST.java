public class BST {
    private BstNode root;

    public BstNode getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void insertToBst(Integer value) {
        if (isEmpty()) {
            this.root = new BstNode(value);
        } else {
            insertNode(this.root, value);
        }
        System.out.println("Insert Successfully!");
    }

    public BstNode insertNode(BstNode root, Integer value) {
        BstNode tempNode;
        Integer rootValue = root.getValue();
        if (value <= rootValue) {
            if (root.left == null) {
                root.setLeft(new BstNode(value));
                return root.left;
            } else {
                tempNode = root.left;
            }
        } else if (root.right == null) {
            root.setRight(new BstNode(value));
            return root.right;
        } else {
            tempNode = root.right;
        }
        return insertNode(tempNode, value);
    }

    public boolean delete(BstNode root, Integer value){
        if (root == null){
            return false;
        }
        if (value.compareTo(root.value) < 0){
            return delete(root.left, value);
        } else if (value.compareTo(root.value) > 0){
            return delete(root.right,value);
        } else {
            if (root.left == null){
                root = root.right;
            }else if (root.right == null){
                root = root.left;
            } else {
                BstNode temp = root.left;
                while (root.right != null){
                    temp = temp.right;
                }
                root.value = temp.value;
                return delete(root, temp.value);
            }
        }
        return true;
    }

    public void doPostOder(BstNode root) {
        if (root == null) {
        } else {
            doPostOder(root.getLeft());
            doPostOder(root.getRight());
            System.out.print(root.getValue() + " ");
        }
    }

    public void postOrder() {
        doPostOder(root);
    }

}