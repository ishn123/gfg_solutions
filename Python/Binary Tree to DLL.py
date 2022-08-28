class Solution:
    def bToDLL(self,root):
        # do Code her
        self.head = self.prev = None
        self.dfs(root)
        return self.head
        
    def dfs(self,root):
        if root == None:
            return 
        
        self.dfs(root.left)
        if self.head == None:
            self.head = root
            
        root.left = self.prev
        if self.prev == None:
            self.prev = root
        else:
            self.prev.right = root
            self.prev = root
            
            
        self.dfs(root.right)
        return



