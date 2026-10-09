package java.game.cars;

import java.game.*;

public class Naxas_VT extends VehicleType
{
	public Naxas_VT( int id )
	{
		VehicleModel vmd;

/*==================[ TORNADO ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Naxas:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=740;	vmd.fullPrestige= 755;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Naxas Tornado";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Naxas:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=780;	vmd.fullPrestige= 800;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Naxas Tornado";


			vmd=new VehicleModel( cars.racers.Naxas:0x00000006r, VS_USED );
			vtdarr.addElement(vmd );
			vmd.prevalence = 400.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=735;	vmd.fullPrestige= 740;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Naxas Tornado";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);


			vmd=new VehicleModel( cars.racers.Naxas:0x00000006r, VS_STOCK );
			vtdarr.addElement(vmd );
			vmd.prevalence = 200.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=745;	vmd.fullPrestige= 750;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Naxas Tornado";
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Naxas:0x00000006r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 300.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=740;	vmd.fullPrestige= 750;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Naxas Tornado";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Naxas:0x00000006r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 300.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=735;	vmd.fullPrestige= 755;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Naxas Tornado";

/*==================[ LUX 4000 ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Naxas:0x00000156r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=680;	vmd.fullPrestige= 700;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Naxas Lux 4000";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Naxas:0x00000156r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=710;	vmd.fullPrestige= 725;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Naxas Lux 4000";


			vmd=new VehicleModel( cars.racers.Naxas:0x00000156r, VS_USED );
			vtdarr.addElement(vmd );
			vmd.prevalence = 200.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=660;	vmd.fullPrestige= 670;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Naxas Lux 4000";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);


			vmd=new VehicleModel( cars.racers.Naxas:0x00000156r, VS_STOCK );
			vtdarr.addElement(vmd );
			vmd.prevalence = 100.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=682;	vmd.fullPrestige= 685;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Naxas Lux 4000";
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Naxas:0x00000156r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 200.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=675;	vmd.fullPrestige= 685;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Naxas Lux 4000";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Naxas:0x00000156r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 200.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=670;	vmd.fullPrestige= 690;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Naxas Lux 4000";

/*==================[ EXTREME EDITION ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Naxas:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=700;	vmd.fullPrestige= 725;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Naxas Extreme Edition";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Naxas:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=740;	vmd.fullPrestige= 750;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Naxas Extreme Edition";


			vmd=new VehicleModel( cars.racers.Naxas:0x00000157r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 100.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=710;	vmd.fullPrestige= 720;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Naxas Extreme Edition";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Naxas:0x00000157r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 100.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=705;	vmd.fullPrestige= 725;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Naxas Extreme Edition";

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