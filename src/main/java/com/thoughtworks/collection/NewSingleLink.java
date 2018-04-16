package com.thoughtworks.collection;

public class NewSingleLink implements SingleLink<Integer> {

    private class Node//节点类
    {
        private Integer data;
        private Node next;

        public Node() {
        }

        public Node(Integer data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;//指向链表头节点的引用变量
    private Node tail;//指向链表尾节点的引用变量
    int size;//链表中当前总节点数
    //生成链表对象是一个空表

    public NewSingleLink() {
        head = null;
        tail = null;
    }

    //生成链表对象时有一个头节点 （有参构造器）
    public NewSingleLink(Integer data) {
        head = new Node(data, null);//指定一个头节点的数据域值为data,不指向其他节点
        tail = head;
        size++;
    }

    //返回链表的长度
    public int length() {

        return size;
    }

    //获取指定位置的元素
    @Override
    public Integer getNode(int index) {
        return findNodeByIndex(index).data;
    }

    //查找    指定索引位置的节点
    public Node findNodeByIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("线性表索引越界");
        }
        Node current = head;//从头节点开始下移遍历
        for (int i = 0; i < size && current.next != null; i++, current = current.next) {
            if (i == index) {
                return current;
            }
        }
        return null;
    }

    public Integer getHeaderData() {
        return null;
    }

    public Integer getTailData() {
        return null;
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean deleteFirst() {
        return false;
    }

    public boolean deleteLast() {
        return false;
    }                //删除尾部元素；

    public void addHeadPointer(Integer item) {

    }    //添加头指针

    public void addTailPointer(Integer item) {

    }         //添加尾指针
}
