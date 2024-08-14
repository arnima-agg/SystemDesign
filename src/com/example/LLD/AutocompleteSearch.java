package com.example.LLD;

import java.util.ArrayList;
import java.util.List;

public class AutocompleteSearch {
    public Node root ;
    class Node {
        Node link[] = new Node[26];
        boolean isEnd;

        public boolean containsKey(char ch) {
            return link[ch-'a'] != null;
        }

        public void put(char ch, Node node) {
            link[ch-'a'] = node;
        }

        public Node get(char ch) {
            return link[ch-'a'];
        }

        public void setEnd() {
            isEnd = true;
        }

        public boolean getEnd() {
            return isEnd;
        }
    }

    public AutocompleteSearch() {
        root = new Node();
    }

    public void insert(String word) {
        Node node = root;
        for(int i=0;i<word.length();i++) {
            if(!node.containsKey(word.charAt(i))) {
                node.put(word.charAt(i), new Node());
            }
            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }

    public void dfs(Node node, List<String> result, String val) {
        if(node.getEnd()) {
            result.add(val);
        }
        for(int i=0;i<node.link.length;i++) {
            if(node.link[i] != null) {
                dfs(node.link[i], result, val+(char)(i+'a'));
            }
        }
    }

    public List<String> search(String prefix) {
        Node node = root;
        List<String> result = new ArrayList<>();
        for(int i=0;i<prefix.length();i++) {
            if(!node.containsKey(prefix.charAt(i))) {
                return result;
            }
            node = node.get(prefix.charAt(i));
        }
        dfs(node, result, prefix);
        return result;
    }

    public static void main(String args[]) {
        AutocompleteSearch autocompleteSearch = new AutocompleteSearch();
        autocompleteSearch.insert("hello");
        autocompleteSearch.insert("hell");
        autocompleteSearch.insert("hat");
        autocompleteSearch.insert("bat");
        List<String> results = autocompleteSearch.search("hel");
        for(String s : results) {
            System.out.println(s);
        }
    }


}
