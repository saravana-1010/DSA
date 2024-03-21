//package org.example;
//
//import java.util.*;
//
//
//public class Example {
//
//
//
////	Following the structure used for Binary Tree
//
//	static class BinaryTreeNode<T> {
//		T data;
//		BinaryTreeNode<T> left;
//		BinaryTreeNode<T> right;
//
//		public BinaryTreeNode(T data) {
//			this.data = data;
//			this.left = null;
//			this.right = null;
//		}
//	}
//
//    public class Solution {
//
//        static class Pair {
//            BinaryTreeNode<Integer> node;
//            int status;
//            public Pair(BinaryTreeNode<Integer> node, int status) {
//                this.node = node;
//                this.status = status;
//            }
//        }
//
//        public static void preOrder(BinaryTreeNode<Integer> root) {
//            //Your code goes here
//            Stack<Pair> stack = new Stack<>();
//            stack.add(new Pair(root, 1));
//            while(!stack.isEmpty()) {
//                Pair pair = stack.remove();
//                BinaryTreeNode<Integer> node = pair.node;
//                int status = pair.status;
//                if(status == 1) {
//                    System.out.print(node.data);
//                    stack.add(new Pair(node, status+=1));
//                    if(node.left != null) {
//                        stack.add(new Pair(node.left, 1));
//                    }
//                } else if(status == 2) {
//                    stack.add(new Pair(node, status+=1));
//                    if(node.right != null) {
//                        stack.add(new Pair(node.right, 1));
//                    }
//                } else if(status == 3) {
//                    stack.remove();
//                }
//            }
//        }
//
//    }
//
//
//}
