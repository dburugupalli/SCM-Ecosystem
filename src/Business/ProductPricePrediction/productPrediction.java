/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ProductPricePrediction;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.classifiers.functions.LinearRegression;
/**
 *
 * @author B D Sai Santosh
 */
public class productPrediction {
    public void linearRegression() throws Exception {
            DataSource source = new DataSource("C:\\Users\\B D Sai Santosh\\Desktop\\Netbeans Folder\\linearRegression_Prediction\\house.arff");
		Instances dataset = source.getDataSet();
		//set class index to the last attribute
		dataset.setClassIndex(dataset.numAttributes()-1);
		
		//Build model
		LinearRegression model = new LinearRegression();
		model.buildClassifier(dataset);
		//output model
		System.out.println("LR FORMULA : "+model);	
		
		// Now Predicting the cost 
		Instance myHouse = dataset.lastInstance();
		double price = model.classifyInstance(myHouse);
		System.out.println("-------------------------");	
		System.out.println("PRECTING THE PRICE : "+price);	
	}
    }
    

