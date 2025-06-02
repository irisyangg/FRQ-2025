public Round(String[] names){
        competitorList=new ArrayList<>();
        for(int i=0; i<names.length; i++){
            Competitor competitor= new Competitor(names[i], i+1);
            competitorList.add(competitor);
        }
    }
