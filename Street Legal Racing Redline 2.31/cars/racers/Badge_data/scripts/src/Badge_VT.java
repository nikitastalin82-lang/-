package java.game.cars;

import java.game.*;

public class Badge_VT extends VehicleType
{
	public Badge_VT( int id )
	{
		VehicleModel vmd;

/*==================[ MODEL '67 ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Badge:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=401;	vmd.fullPrestige= 420;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Badge '67";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Badge:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=430;	vmd.fullPrestige= 450;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Badge '67";


			vmd=new VehicleModel( cars.racers.Badge:0x00000006r, VS_USED );
			vtdarr.addElement(vmd );
			vmd.prevalence = 800.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=380;	vmd.fullPrestige= 395;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Badge '67";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);


			vmd=new VehicleModel( cars.racers.Badge:0x00000006r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 600.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=401;	vmd.fullPrestige= 420;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Badge '67";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Badge:0x00000006r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 500.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=401;	vmd.fullPrestige= 420;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Badge '67";

/*==================[ MODEL GTO ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Badge:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=457;	vmd.fullPrestige= 465;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Badge '67";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Badge:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=457;	vmd.fullPrestige= 465;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Badge '67";


			vmd=new VehicleModel( cars.racers.Badge:0x00000157r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 400.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=457;	vmd.fullPrestige= 460;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Badge '67";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Badge:0x00000157r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 300.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=457;	vmd.fullPrestige= 470;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Badge '67";

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