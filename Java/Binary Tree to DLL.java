class Solution
{
    Node head = null, prev = null;
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here	
	dfs(root);
	return head;
    }
    void dfs(Node root){
        if(root==null)return;
        dfs(root.left);
        if(head==null){
            head = root;
        }
        root.left = prev;
        if(prev==null){
            prev = root;
        }else{
            prev.right = root;
            prev = root;
        }
        dfs(root.right);
        return;
    }
}