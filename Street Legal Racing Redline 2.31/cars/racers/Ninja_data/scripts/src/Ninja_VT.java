package java.game.cars;

import java.game.*;

public class Ninja_VT extends VehicleType
{
	public Ninja_VT( int id )
	{
		VehicleModel vmd;

/*==================[ TURBOHATCH ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Ninja:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=253;	vmd.fullPrestige= 255;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Ninja TurboHatch";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Ninja:0x00000006r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=260;	vmd.fullPrestige= 270;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Ninja TurboHatch";


			vmd=new VehicleModel( cars.racers.Ninja:0x00000006r, VS_USED );
			vtdarr.addElement(vmd );
			vmd.prevalence = 1000.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=245;	vmd.fullPrestige= 250;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Ninja TurboHatch";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);


			vmd=new VehicleModel( cars.racers.Ninja:0x00000006r, VS_STOCK );
			vtdarr.addElement(vmd );
			vmd.prevalence = 900.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=253;	vmd.fullPrestige= 260;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Ninja TurboHatch";
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Ninja:0x00000006r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 700.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=245;	vmd.fullPrestige= 255;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Ninja TurboHatch";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Ninja:0x00000006r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 1000.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=240;	vmd.fullPrestige= 260;
			vmd.stockQM = qm_stock_Universal_stage_1;	vmd.fullQM = qm_full_Universal_stage_1;
			vmd.vehicleName = "Ninja TurboHatch";

/*==================[ POWERLINE S ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Ninja:0x00000156r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=240;	vmd.fullPrestige= 245;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Ninja PowerLine S";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Ninja:0x00000156r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=265;	vmd.fullPrestige= 280;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Ninja PowerLine S";


			vmd=new VehicleModel( cars.racers.Ninja:0x00000156r, VS_USED );
			vtdarr.addElement(vmd );
			vmd.prevalence = 800.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=230;	vmd.fullPrestige= 235;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Ninja PowerLine S";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);


			vmd=new VehicleModel( cars.racers.Ninja:0x00000156r, VS_STOCK );
			vtdarr.addElement(vmd );
			vmd.prevalence = 700.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=240;	vmd.fullPrestige= 250;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Ninja PowerLine S";
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Ninja:0x00000156r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 500.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=220;	vmd.fullPrestige= 250;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Ninja PowerLine S";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Ninja:0x00000156r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 500.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=225;	vmd.fullPrestige= 255;
			vmd.stockQM = qm_stock_Universal_stage_2;	vmd.fullQM = qm_full_Universal_stage_2;
			vmd.vehicleName = "Ninja PowerLine S";

/*==================[ POWERLINE XT ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Ninja:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=263;	vmd.fullPrestige= 270;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Ninja PowerLine XT";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Ninja:0x00000157r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=280;	vmd.fullPrestige= 285;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Ninja PowerLine XT";


			vmd=new VehicleModel( cars.racers.Ninja:0x00000157r, VS_USED );
			vtdarr.addElement(vmd );
			vmd.prevalence = 600.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=250;	vmd.fullPrestige= 255;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Ninja PowerLine XT";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);


			vmd=new VehicleModel( cars.racers.Ninja:0x00000157r, VS_STOCK );
			vtdarr.addElement(vmd );
			vmd.prevalence = 600.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=263;	vmd.fullPrestige= 265;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Ninja PowerLine XT";
			prevalence += vmd.prevalence;


			vmd=new VehicleModel( cars.racers.Ninja:0x00000157r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 500.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=255;	vmd.fullPrestige= 265;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Ninja PowerLine XT";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Ninja:0x00000157r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 500.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=250;	vmd.fullPrestige= 270;
			vmd.stockQM = qm_stock_Universal_stage_3;	vmd.fullQM = qm_full_Universal_stage_3;
			vmd.vehicleName = "Ninja PowerLine XT";

/*==================[ TOURER ]==================*/


			// stock version //
			vmd=new VehicleModel( cars.racers.Ninja:0x00000158r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 1.5;
			vmd.stockPrestige=510;	vmd.fullPrestige= 525;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Ninja Tourer";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Ninja:0x00000158r, VS_DEMO );
			vtdarr.addElement(vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=540;	vmd.fullPrestige= 565;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Ninja Tourer";


			vmd=new VehicleModel( cars.racers.Ninja:0x00000158r, VS_DRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 300.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=510;	vmd.fullPrestige= 525;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Ninja Tourer";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Ninja:0x00000158r, VS_NRACE );
			vtdarr.addElement(vmd );
			vmd.prevalence = 400.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=505;	vmd.fullPrestige= 530;
			vmd.stockQM = qm_stock_Universal_stage_4;	vmd.fullQM = qm_full_Universal_stage_4;
			vmd.vehicleName = "Ninja Tourer";

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