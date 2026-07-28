class PrefixTree {
    
    // Internal helper class representing each node in the tree
    private class TrieNode {
        private TrieNode[] children;
        private boolean isWord;

        public TrieNode() {
            // 26 English letters ('a' through 'z')
            this.children = new TrieNode[26]; 
            this.isWord = false;
        }
    }

    private final TrieNode root;

    /** Initializes the prefix tree object. */
    public PrefixTree() {
        root = new TrieNode();
    }
    
    /** Inserts the string word into the prefix tree. */
    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isWord = true;
    }
    
    /** Returns true if the string word is in the prefix tree, and false otherwise. */
    public boolean search(String word) {
        TrieNode node = traverse(word);
        return node != null && node.isWord;
    }
    
    /** Returns true if there is a previously inserted string word that has the prefix, and false otherwise. */
    public boolean startsWith(String prefix) {
        return traverse(prefix) != null;
    }

    /** Helper method to navigate the tree character by character. */
    private TrieNode traverse(String str) {
        TrieNode current = root;
        for (char c : str.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                return null;
            }
            current = current.children[index];
        }
        return current;
    }
}
