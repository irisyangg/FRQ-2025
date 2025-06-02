public int walkDogs(int hour){
        int dogs=company.numAvailableDogs(hour);
        int walked=dogs;
        if(walked>maxDogs){
            walked=maxDogs;
        }
        company.updateDogs(hour, walked);
        return walked;
    }
