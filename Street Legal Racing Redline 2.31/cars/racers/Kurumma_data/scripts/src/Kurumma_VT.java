package java.game.cars;

import java.game.*;

public class Kurumma_VT extends VehicleType
{
	public Kurumma_VT( int id )
	{
		VehicleModel vmd;

/*==================[ Z3 ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Kurumma:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=355;	vmd.fullPrestige= 365;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Kurumma Z3";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Kurumma:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=375;	vmd.fullPrestige= 390;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Kurumma Z3";


			vmd=new VehicleModel( cars.racers.Kurumma:0x00000006r, VS_USED );
			vtdarr.addElement(vmd );
			vmd.prevalence = 400.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=350;	vmd.fullPrestige= 355;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Kurumma Z3";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);


			vmd=new VehicleModel( cars.racers.Kurumma:0x00000006r, VS_STOCK );
			vtdarr.addElement(vmd );
			vmd.prevalence = 400.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=359;	vmd.fullPrestige= 365;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Kurumma Z3";
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Kurumma:0x00000006r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 300.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=355;	vmd.fullPrestige= 365;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Kurumma Z3";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Kurumma:0x00000006r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 400.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=350;	vmd.fullPrestige= 370;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Kurumma Z3";

/*==================[ Z35C ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Kurumma:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=840;	vmd.fullPrestige= 860;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Kurumma Z35C";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Kurumma:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=880;	vmd.fullPrestige= 900;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Kurumma Z35C";


			vmd=new VehicleModel( cars.racers.Kurumma:0x00000157r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 100.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=835;	vmd.fullPrestige= 850;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Kurumma Z35C";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Kurumma:0x00000157r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 200.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=840;	vmd.fullPrestige= 880;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Kurumma Z35C";

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