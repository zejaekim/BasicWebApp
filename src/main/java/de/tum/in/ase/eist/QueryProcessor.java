package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Jae";
        } else if (query.contains("plus")) {
            String[] parts = query.split("plus");
            parts[0] = parts[0].replaceAll("\\D+", "");
            parts[1] = parts[1].replaceAll("\\D+", "");
            int res = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
            return Integer.toString(res);
        } else { // TODO extend the programm here
            return "";
        }
    }
}
