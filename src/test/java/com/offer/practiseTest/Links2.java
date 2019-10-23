package com.offer.practiseTest;

/**
 * @author zhugp
 * @description TODO
 * @date 2019/10/11 11:23
 */
public class Links2 {

    class Node{
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }

        public void addNode(Node node) {
            if (this.next == null) {
                this.next = node;
            }else{
                this.next.addNode(node);
            }
        }

//        查询是否存在节点
        public boolean searchNode(String data) {
            if (this.data.equals(data)) {
                return true;
            }else{
                if (this.next == null) {
                    return false;
                }else{
                    return this.next.searchNode(data);
                }
            }
        }

        public void deleteNode(String data) {
            if (this.next.data.equals(data)) {
                this.next = this.next.next;
            }else{
                this.next.deleteNode(data);
            }
        }

        public void update(String oldData, String newData) {

            if (this.data.equals(oldData)) {
                this.data = newData;
            }else{
                if (this.next != null) {
                    this.next.update(oldData, newData);
                }
            }
        }

        public void print() {
            System.out.println(this.data);
            if (this.next != null) {
                this.next.print();
            }
        }

    }

    private Node headNode;

    public void add(String data) {
        Node node = new Node(data);
        if (this.headNode == null) {
            this.headNode = node;
        }else{
            this.headNode.addNode(node);
        }
    }

    public void search(String data) {
        if (this.headNode.searchNode(data)) {
            System.out.println("这个节点存在哦");
        }else{
            System.out.println("这个节点不存在哦");
        }
    }

    public void del(String data) {
        if (this.headNode == null) {
            return;
        }

        if (this.headNode.data.equals(data)) {
            this.headNode = this.headNode.next;
        }else{
            if (this.headNode.searchNode(data)) {
                this.headNode.deleteNode(data);
            }else{
                System.out.println("无法删除,因为不存在这个节点");
            }
        }
    }


    public void update(String oldData, String newData) {
        this.headNode.update(oldData, newData);
    }

    public void printLinks() {
        this.headNode.print();
    }


    public static void main(String args[]){
        Links2 l = new Links2();
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");

        l.search("1");
        l.del("3");
        l.update("4", "0");
        l.printLinks();
    }

}
