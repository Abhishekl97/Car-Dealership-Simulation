package Project_3_2;

import java.io.IOException;

class SuperCar extends Vehicle {
    // adding cost and sales price to the car
    public void buyVehicle(FNCDdata fnc) throws IOException {
        int cp1 = rand.nextInt(40000, 60001);
        cost_price[8].add(cp1);
        sales_price[8].add(cp1 * 2);
        if(getCondition(vehicle[8].get(vehicle[8].size()-1))==0){//If vehicle is initially broken, reducing its cost price by 50%.
            cost_price[8].set((vehicle[8].size()-1), (int)(cost_price[8].get(vehicle[8].size()-1)*0.5));
        } else if (getCondition(vehicle[8].get(vehicle[8].size()-1))==1){//If vehicle is initially used, reducing its cost price by 20%.
            cost_price[8].set((vehicle[8].size()-1), (int)(cost_price[8].get(vehicle[8].size()-1)*0.8));
        }
        Operation.addBudget(0,fnc);
        Operation.budget = Operation.budget - cost_price[8].get(vehicle[8].size()-1);
        System.out.println("Bought "+carType[8]+" "+vehicle[8].get(vehicle[8].size()-1)+" for $"+cost_price[8].get(cost_price[8].size()-1));
        fnc.dayEnd(0,vehicle[8].size()-1,3);//obs
    }

}
