class Solution {

    public int solution(String skill, String[] skill_trees) {

        char[] charArray = skill.toCharArray();
        int answer = 0;

        for (String skillTree : skill_trees) {

            int index = 0;
            boolean valid = true;

            for (int i = 0; i < skillTree.length(); i++) {

                char current = skillTree.charAt(i);

                for (int j = 0; j < charArray.length; j++) {

                    if (current == charArray[j]) {

                        if (j != index) {
                            valid = false;
                        } else {
                            index++;
                        }

                        break;
                    }
                }

                if (!valid) {
                    break;
                }
            }

            if (valid) {
                answer++;
            }
        }

        return answer;
    }
}