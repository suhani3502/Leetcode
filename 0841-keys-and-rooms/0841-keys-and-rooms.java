class Solution {
    public void unlockRooms(List<List<Integer>> rooms , int curr , boolean[] vis){
        vis[curr]=true;
        for (int i : rooms.get(curr)){
            if (!vis[i]){
                unlockRooms(rooms , i, vis);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean vis[]= new boolean[rooms.size()];
        unlockRooms(rooms, 0,vis);
        for (int i=0 ; i<vis.length;i++){
            if (!vis[i]) return false;
        }
        return true;
    }
}