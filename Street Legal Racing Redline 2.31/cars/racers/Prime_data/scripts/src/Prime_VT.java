package java.game.cars;

import java.game.*;

public class Prime_VT extends VehicleType
{
	public Prime_VT( int id )
	{
		VehicleModel vmd;

		prevalence = 0.0;

		// DLH 500 //

			vmd=new VehicleModel( cars.racers.Prime:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.minPower   = 2.0;	vmd.maxPower	= 2.0;
			vmd.prevalence = 1900.0;
			vmd.stockPrestige=876;	vmd.fullPrestige= 982;
			vmd.stockQM = qm_stock_Prime_DLH_500;	vmd.fullQM = qm_full_Prime_DLH_500;
			vmd.vehicleName = "Prime DLH 500";


			vmd=new VehicleModel( cars.racers.Prime:0x00000006r, VS_USED );
			vtdarr.addElement(vmd );
			vmd.prevalence = 1250.0;
			vmd.stockPrestige=876;	vmd.fullPrestige= 982;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockQM = qm_stock_Prime_DLH_500;	vmd.fullQM = qm_full_Prime_DLH_500;
			vmd.vehicleName = "Prime DLH 500";
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Prime:0x00000006r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 1365.0;
			vmd.minPower	= 1.25;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.25;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=876;	vmd.fullPrestige= 982;
		vmd.stockQM = qm_stock_Prime_DLH_500;	vmd.fullQM = qm_full_Prime_DLH_500;
		vmd.vehicleName = "Prime DLH 500";
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Prime:0x00000006r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 1065.0;
			vmd.minPower	= 1.55;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.55;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=396;	vmd.fullPrestige= 982;
		vmd.stockQM = qm_stock_Prime_DLH_500;	vmd.fullQM = qm_full_Prime_DLH_500;
		vmd.vehicleName = "Prime DLH 500";


			vmd=new VehicleModel( cars.racers.Prime:0x00000006r, VS_RRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 1900.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.25;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=597;	vmd.fullPrestige= 640;
		vmd.stockQM = qm_stock_Prime_DLH_500;	vmd.fullQM = qm_full_Prime_DLH_500;
		vmd.vehicleName = "Prime DLH 500";

		//DLH700


			vmd=new VehicleModel( cars.racers.Prime:0x00000157r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 965.0;
			vmd.minPower	= 1.25;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.25;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=1230;	vmd.fullPrestige= 1240;
		vmd.stockQM = qm_stock_Prime_DLH_700;	vmd.fullQM = qm_full_Prime_DLH_700;
		vmd.vehicleName = "Prime DLH 700";
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Prime:0x00000157r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 565.0;
			vmd.minPower	= 1.55;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.55;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=1220;	vmd.fullPrestige= 1250;
		vmd.stockQM = qm_stock_Prime_DLH_700;	vmd.fullQM = qm_full_Prime_DLH_700;
		vmd.vehicleName = "Prime DLH 700";


			vmd=new VehicleModel( cars.racers.Prime:0x00000157r, VS_RRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 900.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.25;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=1225;	vmd.fullPrestige= 1245;
		vmd.stockQM = qm_stock_Prime_DLH_700;	vmd.fullQM = qm_full_Prime_DLH_700;
		vmd.vehicleName = "Prime DLH 700";

			vmd=new VehicleModel( cars.racers.Prime:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.minPower   = 2.0;	vmd.maxPower	= 2.0;
			vmd.prevalence = 1000.0;
			vmd.stockPrestige=1230;	vmd.fullPrestige= 1245;
		vmd.stockQM = qm_stock_Prime_DLH_700;	vmd.fullQM = qm_full_Prime_DLH_700;
		vmd.vehicleName = "Prime DLH 700";

		// make color indexes //
		addColorIndex(GameLogic.RID_CARCOLOR_Baiern_Devils_eye_red);
		addColorIndex(GameLogic.RID_CARCOLOR_Baiern_Spring_yellow);

		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Zucker);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Tornado_rot);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Nacht);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Smaragd);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Black_mage);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Hamvas_Grun);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Indigo);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Jazz);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Antracit);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Mercator_Blau);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Murano);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Champagner);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Ozean);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Reflex);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Saratoga);

//		prevalence *= 1000.0;
	}
}
