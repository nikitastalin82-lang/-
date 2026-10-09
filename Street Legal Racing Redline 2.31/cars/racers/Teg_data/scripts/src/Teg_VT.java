package java.game.cars;

import java.game.*;

public class Teg_VT extends VehicleType
{
	public Teg_VT( int id )
	{
		VehicleModel vmd;

/*==================[ S199 ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Teg:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=220;	vmd.fullPrestige= 230;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Teg S199";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Teg:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=240;	vmd.fullPrestige= 250;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Teg S199";


			vmd=new VehicleModel( cars.racers.Teg:0x00000006r, VS_USED );
			vtdarr.addElement(vmd );
			vmd.prevalence = 1000.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=210;	vmd.fullPrestige= 220;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Teg S199";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);


			vmd=new VehicleModel( cars.racers.Teg:0x00000006r, VS_STOCK );
			vtdarr.addElement(vmd );
			vmd.prevalence = 700.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=225;	vmd.fullPrestige= 230;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Teg S199";
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Teg:0x00000006r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 600.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=215;	vmd.fullPrestige= 225;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Teg S199";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Teg:0x00000006r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 600.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=210;	vmd.fullPrestige= 230;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Teg S199";

/*==================[ T267 ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Teg:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=380;	vmd.fullPrestige= 385;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Teg T267";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Teg:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=390;	vmd.fullPrestige= 400;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Teg T267";


			vmd=new VehicleModel( cars.racers.Teg:0x00000157r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 400.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=370;	vmd.fullPrestige= 390;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Teg T267";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Teg:0x00000157r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 400.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=365;	vmd.fullPrestige= 400;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Teg T267";

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