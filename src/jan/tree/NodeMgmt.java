package jan.tree;

public class NodeMgmt {
    Node head = null;

    public class Node {
        Node left;
        Node right;
        int value;

        public Node(int data) {
            this.value = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            Node findNode = this.head;
            while (true) {
                // 현재 노드의 왼쪽에 노드가 들어가야 하는 경우
                if (data < findNode.value) {
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }
                // 현재 노드의 오른쪽에 노드가 들어가야 하는 경우
                } else {
                    if (findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node search(int data) {
        if (this.head == null) {
            return null;
        } else {
            Node findNode = this.head;
            while (findNode != null) {
                if (findNode.value == data) {
                    return findNode;
                } else if (data < findNode.value) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        NodeMgmt nm = new NodeMgmt();
        nm.insertNode(2);
        nm.insertNode(3);
        nm.insertNode(4);
        nm.insertNode(6);

        Node testNode = nm.search(4);
        System.out.println(testNode.value);
    }
}
