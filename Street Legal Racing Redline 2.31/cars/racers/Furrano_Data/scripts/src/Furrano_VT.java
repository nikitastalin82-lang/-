package java.game.cars;

import java.game.*;

public class Furrano_VT extends VehicleType
{
	public Furrano_VT( int id )
	{
		VehicleModel vmd;

/*==================[ GT54 ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Furrano:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=350;	vmd.fullPrestige= 360;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Furrano GT54";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Furrano:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=360;	vmd.fullPrestige= 370;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Furrano GT54";


			vmd=new VehicleModel( cars.racers.Furrano:0x00000006r, VS_USED );
			vtdarr.addElement(vmd );
			vmd.prevalence = 400.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=345;	vmd.fullPrestige= 350;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Furrano GT54";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);


			vmd=new VehicleModel( cars.racers.Furrano:0x00000006r, VS_STOCK );
			vtdarr.addElement(vmd );
			vmd.prevalence = 200.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=355;	vmd.fullPrestige= 360;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Furrano GT54";
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Furrano:0x00000006r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 200.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=350;	vmd.fullPrestige= 360;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Furrano GT54";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Furrano:0x00000006r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 300.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=345;	vmd.fullPrestige= 365;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Furrano GT54";

/*==================[ GTS ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Furrano:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=350;	vmd.fullPrestige= 360;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Furrano GTS";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Furrano:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=370;	vmd.fullPrestige= 380;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Furrano GTS";


			vmd=new VehicleModel( cars.racers.Furrano:0x00000157r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 100.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=350;	vmd.fullPrestige= 400;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Furrano GTS";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Furrano:0x00000157r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 100.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=345;	vmd.fullPrestige= 400;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Furrano GTS";

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