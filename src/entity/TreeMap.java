package entity;

public class TreeMap<E extends Comparable<E>> extends AbtractTree<E> {

    class TreeNode<E> {
        protected E element;
        protected TreeNode<E> left;
        protected TreeNode<E> right;

        TreeNode(E e) {
            this.element = e;
        }
    }

    TreeNode<E> root;
    int size = 0;

    public TreeMap() {
    }

    ;

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = new TreeNode<E>(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> curent = this.root;
            while (curent != null) {
                if (e.compareTo(curent.element) > 0) {
                    parent = curent;
                    curent = curent.right;
                } else if (e.compareTo(curent.element) < 0) {
                    parent = curent;
                    curent = curent.left;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) > 0) {
                parent.right = new TreeNode<E>(e);
            } else {
                parent.left = new TreeNode<E>(e);
            }
        }
        size += 1;
        return true;
    }

    @Override
    public void show() {
        show(this.root);
    }

    private void show(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        show(root.left);
        System.out.println("Element :" + root.element);
        show(root.right);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    public boolean delete(E e) {
        TreeNode<E> parent = null;
        TreeNode<E> curent = this.root;
        boolean result = false;
        int visibo =0;
        while (curent!=null) {
            if(curent.element==e){
                result=true;
                break;
            }else if(e.compareTo(curent.element)>0){
                parent=curent;
                curent =curent.right;
                visibo=1;
            }else {
                parent=curent;
                curent=curent.left;
                visibo=-1;
            }
        }
        if(result){
            if(visibo==-1){
                if (curent.left!=null){
                    parent.left=curent.left;
                }else {
                    parent.left=curent.right;
                }
            } else if (visibo==1) {
                if (curent.left!=null){
                    parent.right=curent.left;
                }else {
                    parent.right=curent.right;
                }
            }
        }
        return result;
    }
}

