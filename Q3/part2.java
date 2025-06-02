public ArrayList<Match> buildMatches(){
        ArrayList<Match> matched= new ArrayList<Match>();
        int start=0;
        int end=0;
        if(competitorList.size%2==1){
            start=1;
        }
        if(competitorList.size%2==0){
            for(int i=0; i<competitorList.size()/2; i++){
                Competitor one= competitorList.get(start+i);
                Competitor two= competitorList.get(end-i);
                Match match= new Match(one, two);
                matched.add(match);
            }
        }
        return matched;
    }
