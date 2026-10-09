package java.game.cars;

import java.game.*;

public class Axis_VT extends VehicleType
{
	public Axis_VT( int id )
	{
		VehicleModel vmd;

/*==================[ 200S ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Axis:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=249;	vmd.fullPrestige= 260;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Axis 200S";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Axis:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=296;	vmd.fullPrestige= 300;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Axis 200S";


			vmd=new VehicleModel( cars.racers.Axis:0x00000006r, VS_USED );
			vtdarr.addElement(vmd );
			vmd.prevalence = 1100.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=220;	vmd.fullPrestige= 240;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Axis 200S";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);


			vmd=new VehicleModel( cars.racers.Axis:0x00000006r, VS_STOCK );
			vtdarr.addElement(vmd );
			vmd.prevalence = 900.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=220;	vmd.fullPrestige= 240;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Axis 200S";
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Axis:0x00000006r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 800.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=249;	vmd.fullPrestige= 260;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Axis 200S";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Axis:0x00000006r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 1000.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=249;	vmd.fullPrestige= 260;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Axis 200S";

/*==================[ 200XT ]==================*/

			// stock version //
			vmd=new VehicleModel( cars.racers.Axis:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=296;	vmd.fullPrestige= 300;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Axis 200XT";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Axis:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=350;	vmd.fullPrestige= 365;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Axis 200XT";


			vmd=new VehicleModel( cars.racers.Axis:0x00000157r, VS_USED );
			vtdarr.addElement(vmd );
			vmd.prevalence = 800.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=280;	vmd.fullPrestige= 290;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Axis 200XT";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);


			vmd=new VehicleModel( cars.racers.Axis:0x00000157r, VS_STOCK );
			vtdarr.addElement(vmd );
			vmd.prevalence = 700.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=280;	vmd.fullPrestige= 290;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Axis 200XT";
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Axis:0x00000157r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 600.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=296;	vmd.fullPrestige= 300;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Axis 200XT";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Axis:0x00000157r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 600.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=296;	vmd.fullPrestige= 300;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Axis 200XT";

/*==================[ ZX360 ]==================*/

			// stock version //
			vmd=new VehicleModel( cars.racers.Axis:0x00000156r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=497;	vmd.fullPrestige= 500;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Axis ZX360";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Axis:0x00000156r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=497;	vmd.fullPrestige= 500;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Axis ZX360";

			vmd=new VehicleModel( cars.racers.Axis:0x00000156r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 600.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=497;	vmd.fullPrestige= 500;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Axis ZX360";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Axis:0x00000156r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 600.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=497;	vmd.fullPrestige= 500;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Axis ZX360";

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