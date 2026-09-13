class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> unique = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");

            String local = parts[0]
                    .replace(".", "");

            int plusIndex = local.indexOf('+');
            if (plusIndex != -1) {
                local = local.substring(0, plusIndex);
            }

            unique.add(local + "@" + parts[1]);
        }

        return unique.size(); 
    }
}