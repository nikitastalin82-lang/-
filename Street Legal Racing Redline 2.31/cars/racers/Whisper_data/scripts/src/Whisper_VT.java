package java.game.cars;

import java.game.*;

public class Whisper_VT extends VehicleType
{
	public Whisper_VT( int id )
	{
		VehicleModel vmd;

/*==================[ C555 ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Whisper:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=730;	vmd.fullPrestige= 740;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Whisper C555";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Whisper:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=745;	vmd.fullPrestige= 755;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Whisper C555";


			vmd=new VehicleModel( cars.racers.Whisper:0x00000006r, VS_USED );
			vtdarr.addElement(vmd );
			vmd.prevalence = 600.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=720;	vmd.fullPrestige= 730;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Whisper C555";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);


			vmd=new VehicleModel( cars.racers.Whisper:0x00000006r, VS_STOCK );
			vtdarr.addElement(vmd );
			vmd.prevalence = 500.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=736;	vmd.fullPrestige= 740;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Whisper C555";
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Whisper:0x00000006r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 500.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=730;	vmd.fullPrestige= 740;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Whisper C555";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Whisper:0x00000006r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 400.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=720;	vmd.fullPrestige= 750;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Whisper C555";

/*==================[ D8800 ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Whisper:0x00000156r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=730;	vmd.fullPrestige= 740;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Whisper D8800";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Whisper:0x00000156r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=750;	vmd.fullPrestige= 765;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Whisper D8800";


			vmd=new VehicleModel( cars.racers.Whisper:0x00000156r, VS_USED );
			vtdarr.addElement(vmd );
			vmd.prevalence = 500.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=725;	vmd.fullPrestige= 730;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Whisper D8800";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);


			vmd=new VehicleModel( cars.racers.Whisper:0x00000156r, VS_STOCK );
			vtdarr.addElement(vmd );
			vmd.prevalence = 300.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=738;	vmd.fullPrestige= 740;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Whisper D8800";
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Whisper:0x00000156r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 300.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=730;	vmd.fullPrestige= 740;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Whisper D8800";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Whisper:0x00000156r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 300.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=725;	vmd.fullPrestige= 750;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Whisper D8800";

/*==================[ R1 ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Whisper:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=730;	vmd.fullPrestige= 750;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Whisper R1";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Whisper:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=765;	vmd.fullPrestige= 795;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Whisper R1";


			vmd=new VehicleModel( cars.racers.Whisper:0x00000157r, VS_USED );
			vtdarr.addElement(vmd );
			vmd.prevalence = 200.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=725;	vmd.fullPrestige= 735;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Whisper R1";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);


			vmd=new VehicleModel( cars.racers.Whisper:0x00000157r, VS_STOCK );
			vtdarr.addElement(vmd );
			vmd.prevalence = 100.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=739;	vmd.fullPrestige= 745;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Whisper R1";
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Whisper:0x00000157r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 200.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=735;	vmd.fullPrestige= 745;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Whisper R1";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Whisper:0x00000157r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 200.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=730;	vmd.fullPrestige= 750;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Whisper R1";

/*==================[ Q1000XL ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Whisper:0x00000158r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=1520;	vmd.fullPrestige= 1550;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Whisper Q1000XL";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Whisper:0x00000158r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=1600;	vmd.fullPrestige= 1650;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Whisper Q1000XL";


			vmd=new VehicleModel( cars.racers.Whisper:0x00000158r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 100.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=1500;	vmd.fullPrestige= 1550;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Whisper Q1000XL";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Whisper:0x00000158r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 100.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=1500;	vmd.fullPrestige= 1600;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Whisper Q1000XL";

/*==================[ COLORS ]==================*/

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
	}
}