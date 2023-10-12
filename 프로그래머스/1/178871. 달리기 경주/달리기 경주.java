import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        // Create a HashMap to store the position of each player
        HashMap<String, Integer> playerPositions = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerPositions.put(players[i], i);
        }

        // Process each calling
        for (String calling : callings) {
            if (playerPositions.containsKey(calling)) { 
                int currentPosition = playerPositions.get(calling);
                if(currentPosition > 0){
                    // Swap the positions of the called player and the one before him
                    String previousPlayer = players[currentPosition - 1];
                    players[currentPosition] = previousPlayer;
                    players[currentPosition - 1] = calling;

                    // Update their positions in the map
                    playerPositions.put(previousPlayer, currentPosition);
                    playerPositions.put(calling, currentPosition - 1);
                }
            }
        }
        
        return players;
    }
}
