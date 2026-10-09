package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Badge_67 extends Badge_models
{
	public Badge_67( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Hauler's";
		vendorName = "Badge";
		model = MODEL_BADGE_67;
		modelName = "'67";
		vehicleName = "Hauler's " + modelName + " "  + vendorName;
		name = getName();

		description = "The Badge is one of the first cars manufactured under Hauler's brand. They had a tough competetion with the Muscle Cars America brand far in 1970 when this model has came out. Hauler's put the monstrous 5.4L 419HP engine into a 1370kg chassis and feature the engine with their latest 4-speed manual transmission. The muscle car lovers were impressed by it's acceleration and high speed, but they gone to MC because of the poor handling of a '67 Badge caused by the incomplete suspension, Hauler's were being in rush to complete it faster to start selling the Badge out earlier than MCA, but they've failed and in 2 years after the MC GT release they've stop the production of a '67 Badge.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(1.945);
		brand_new_prestige_value = 34.03;
 
		fully_stripped_drag = 0.55;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(32));
		exhaustSlotIDList.addElement(new Integer(33));

		L_stock_door_slot = 5; //stock driver's door
		R_stock_door_slot = 6; //stock passenger's door

		L_scissor_door_slot = 650; //scissor driver's door
		R_scissor_door_slot = 651; //scissor passenger's door

		L_suicide_door_slot = 653; //suicide driver's door
		R_suicide_door_slot = 652; //suicide passenger's door

		L_butterfly_door_slot = 654; //butterfly driver's door
		R_butterfly_door_slot = 655; //butterfly passenger's door

		//FREE SLOTS, FOR CUSTOM STYLED DOORS, LIKE WING DOORS, UNUSED IN THIS CAR
//		L_custom_door_slot = 658; //custom driver's door
//		R_custom_door_slot = 657; //custom passenger's door
	}

	public void addStockParts( Descriptor desc )
	{
		// stock 1 stuffs //

		stock_parts_list_E  = new int[2];
		stock_parts_list_E[ 0] = parts.engines.MC_Prime_SuperDuty:0x0000000Ar; // "5.4L V8" //
		stock_parts_list_E[ 1] = parts:0x000053FFr; // "stock battery" //

		stock_parts_list_RL = new int[2];
		stock_parts_list_RL[ 0] = cars.racers.Badge:0x000000E3r; // "L taillights" //
		stock_parts_list_RL[ 1] = cars.racers.Badge:0x000000DFr; // "RL window" //

		stock_parts_list_RR = new int[2];
		stock_parts_list_RR[ 0] = cars.racers.Badge:0x000000DDr; // "R taillights" //
		stock_parts_list_RR[ 1] = cars.racers.Badge:0x000000E8r; // "RR window" //

		stock_parts_list_F  = new int[7];
		stock_parts_list_F[ 0] = cars.racers.Badge:0x000000F6r; // "F bumper_panel" //
		stock_parts_list_F[ 2] = cars.racers.Badge:0x000000E5r; // "F grill" //
		stock_parts_list_F[ 3] = cars.racers.Badge:0x000000E0r; // "F grill frame" //
		stock_parts_list_F[ 4] = cars.racers.Badge:0x000000D4r; // "F spoiler" //
		stock_parts_list_F[ 5] = cars.racers.Badge:0x000000D1r; // "hood" //
		stock_parts_list_F[ 6] = cars.racers.Badge:0x000000E1r; // "F windshield" //

		stock_parts_list_Rr = new int[5];
		stock_parts_list_Rr[ 0] = cars.racers.Badge:0x000000DCr; // "R bumper" //
		stock_parts_list_Rr[ 1] = cars.racers.Badge:0x000000E2r; // "R seats" //
		stock_parts_list_Rr[ 2] = cars.racers.Badge:0x000000D3r; // "R windshield" //
		stock_parts_list_Rr[ 3] = cars.racers.Badge:0x000000D2r; // "trunk" //
		stock_parts_list_Rr[ 4] = cars.racers.Badge:0x000000D6r; // "R wing" //

		stock_parts_list_L  = new int[5];
		stock_parts_list_L[ 0] = cars.racers.Badge:0x000000D5r; // "L sideskirt" //
		stock_parts_list_L[ 1] = cars.racers.Badge:0x000000D9r; // "FL door" //
		stock_parts_list_L[ 2] = cars.racers.Badge:0x000000FCr; // "FL seat" //
		stock_parts_list_L[ 3] = cars.racers.Badge:0x000000DEr; // "FL window" //
		stock_parts_list_L[ 4] = cars.racers.Badge:0x000000E4r; // "L mirror" //

		stock_parts_list_R  = new int[5];
		stock_parts_list_R[ 0] = cars.racers.Badge:0x000000DBr; // "R sideskirt" //
		stock_parts_list_R[ 1] = cars.racers.Badge:0x000000DAr; // "FR door" //
		stock_parts_list_R[ 2] = cars.racers.Badge:0x000000FDr; // "FR seat" //
		stock_parts_list_R[ 3] = cars.racers.Badge:0x000000E7r; // "FR window" //
		stock_parts_list_R[ 4] = cars.racers.Badge:0x000000E6r; // "R mirror" //

		// stage 1 stuffs //

		stg_1_engne_kit_limit = 1.25;

		stg_1_parts_list_E  = new int[2];
		stg_1_parts_list_E[ 0] = parts.engines.MC_Prime_SuperDuty:0x00000001r; // "6.5L V8" //
		stg_1_parts_list_E[ 1] = parts:0x000053FFr; // "stock battery" //

		stg_1_parts_list_FL = new int[2];

		// running gear parts lists //

		// stock 1 stuffs //

		if (desc.power < 1.3)
		{
			stock_parts_list_RGear_suspensions = new int[4];
			stock_parts_list_RGear_suspensions[ 0] = parts:0x000001F4r; // "SuperDuty_500_FL_McPherson_strut" //
			stock_parts_list_RGear_suspensions[ 1] = parts:0x000001F5r; // "SuperDuty_500_FR_McPherson_strut" //
			stock_parts_list_RGear_suspensions[ 2] = parts:0x000001F6r; // "SuperDuty_500_RL_trailing_arm" //
			stock_parts_list_RGear_suspensions[ 3] = parts:0x000001F7r; // "SuperDuty_500_RR_trailing_arm" //

			stock_parts_list_RGear_shocks = new int[4];
			stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x000001B0r; // "shock_absorber_SuperDuty_500_front" //
			stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x000001B1r; // "shock_absorber_SuperDuty_500_rear" //

			stock_parts_list_RGear_springs = new int[4];
			stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x000001DAr; // "spring_SuperDuty_500_front" //
			stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x000001DBr; // "spring_SuperDuty_500_rear" //

			stock_parts_list_RGear_brakes = new int[4];
			stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x00000157r; // "brake_SuperDuty_500_front" //
			stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x00000158r; // "brake_SuperDuty_500_rear" //

			stock_parts_list_RGear_sways = new int[2];
			stock_parts_list_RGear_sways[ 0] = parts:0x0000018Fr; // "swaybar_SuperDuty_500_front" //
			stock_parts_list_RGear_sways[ 1] = parts:0x00000190r; // "swaybar_SuperDuty_500_rear" //

			stock_parts_list_RGear_wheels = new int[4];
			stock_parts_list_RGear_wheels[ 0] = stock_parts_list_RGear_wheels[ 1] = parts.wheels:0x000002BCr; // "rim MT Mescaline 11.0 15 ET 40 LOD CATALOG GARAGE" //
			stock_parts_list_RGear_wheels[ 2] = stock_parts_list_RGear_wheels[ 3] = parts.wheels:0x000032BCr; //  "rim MT Mescaline 10.0 15 ET 70 LOD CATALOG GARAGE" //

			stock_parts_list_RGear_tyres = new int[4];
			stock_parts_list_RGear_tyres[ 0] = stock_parts_list_RGear_tyres[ 1] = parts.wheels:0x0000042Dr; // "tyre_215_50_15_8_0_LOD_CATALOG_GARAGE" //
			stock_parts_list_RGear_tyres[ 2] = stock_parts_list_RGear_tyres[ 3] = parts.wheels:0x0000042Br; // "tyre_255_50_15_9_5_LOD_CATALOG_GARAGE" //
		}
		else
		{
			stock_parts_list_RGear_suspensions = new int[4];
			stock_parts_list_RGear_suspensions[ 0] = parts:0x000001F8r; // "SuperDuty_750_FL_McPherson_strut" //
			stock_parts_list_RGear_suspensions[ 1] = parts:0x000001F9r; // "SuperDuty_750_FR_McPherson_strut" //
			stock_parts_list_RGear_suspensions[ 2] = parts:0x000001FAr; // "SuperDuty_750_RL_trailing_arm" //
			stock_parts_list_RGear_suspensions[ 3] = parts:0x000001FBr; // "SuperDuty_750_RR_trailing_arm" //

			stock_parts_list_RGear_shocks = new int[4];
			stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x000001B2r; // "shock_absorber_SuperDuty_750_front" //
			stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x000001B3r; // "shock_absorber_SuperDuty_750_rear" //

			stock_parts_list_RGear_springs = new int[4];
			stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x000001DCr; // "spring_SuperDuty_750_front" //
			stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x000001DDr; // "spring_SuperDuty_750_rear" //

			stock_parts_list_RGear_brakes = new int[4];
			stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x00000159r; // "brake_SuperDuty_750_front" //
			stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x0000015Dr; // "brake_SuperDuty_750_rear" //

			stock_parts_list_RGear_sways = new int[2];
			stock_parts_list_RGear_sways[ 0] = parts:0x00000191r; // "swaybar_SuperDuty_750_front" //
			stock_parts_list_RGear_sways[ 1] = parts:0x00000192r; // "swaybar_SuperDuty_750_rear" //

			stock_parts_list_RGear_wheels = new int[4];
			stock_parts_list_RGear_wheels[ 0] = stock_parts_list_RGear_wheels[ 1] = parts.wheels:0x00000400r; // rim Baiern_DTM 11.0 19 ET -25 LOD CATALOG GARAGE
			stock_parts_list_RGear_wheels[ 2] = stock_parts_list_RGear_wheels[ 3] = parts.wheels:0x00000400r; // rim Baiern_DTM 11.0 19 ET -25 LOD CATALOG GARAGE

			stock_parts_list_RGear_tyres = new int[4];
			stock_parts_list_RGear_tyres[ 0] = stock_parts_list_RGear_tyres[ 1] = parts.wheels:0x00000404r; // tyre 255 25 19 11.0 LOD CATALOG GARAGE
			stock_parts_list_RGear_tyres[ 2] = stock_parts_list_RGear_tyres[ 3] = parts.wheels:0x00000404r; // tyre 255 25 19 11.0 LOD CATALOG GARAGE
		}

		super.addStockParts( desc );

		addPart( cars.racers.Badge:0x0000FFB4r, "steering wheel" );
		addPart( parts.pedals:0x0000BB01r, "stock pedals manual" );

		addPart( cars.racers.Badge:0x000000FBr, "L_stock_exhaust_pipe" );
		addPart( cars.racers.Badge:0x000000FAr, "R_stock_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );

		if (desc.power > 1.25)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.MC_Prime_SuperDuty:0x000000BFr, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.25)/0.75*0.500+0.500),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			
			addPart( parts:0x000001C1r, "12pds canister" );
			if (desc.power > 1.6) addPart( parts:0x000001BFr, "24pds canister" );
		}
	}
}
