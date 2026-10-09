package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Axis_200S extends Axis_models
{
	public Axis_200S( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Duhen Incorporated";
		vendorName = "Axis";
		model = MODEL_200S;
		modelName = "200S";
		vehicleName =  "Duhen " + vendorName + " " +  modelName;
		name = getName();

		description = "Duhen Inc. makes you feel more japaneese with their Axis series. This basic model 200S being of a 1570kg weight has a 1.8L 169HP engine with a 5-speed manual transmission speeding it up to 150KPH, good characteristics for a small city car. This model is also of a very good quality what in a combination with a low stock price makes it very popular amongst the beginners.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(1.318);
		brand_new_prestige_value = 30.94;
 
		fully_stripped_drag = 0.55;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(39));

		L_stock_door_slot = 4; //stock driver's door
		R_stock_door_slot = 7; //stock passenger's door

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
		stock_parts_list_E  = new int[2];
		stock_parts_list_E[ 0] = parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000009Br; // "Duhen D18V I-4" //
		stock_parts_list_E[ 1] = parts:0x000053FFr; // "stock battery" //


		stock_parts_list_F  = new int[4];
		stock_parts_list_F[ 0] = cars.racers.Axis:0x000000CDr; // "F bumper" //
		stock_parts_list_F[ 1] = cars.racers.Axis:0x000000D8r; // "hood" //
		stock_parts_list_F[ 2] = cars.racers.Axis:0x000000D0r; // "F grill" //
		stock_parts_list_F[ 3] = cars.racers.Axis:0x000000D1r; // "F windshield" //

		stock_parts_list_Rr = new int[6];
		stock_parts_list_Rr[ 0] = cars.racers.Axis:0x000000DFr; // "R bumper" //
		stock_parts_list_Rr[ 1] = cars.racers.Axis:0x000000EAr; // "trunk" //
		stock_parts_list_Rr[ 2] = cars.racers.Axis:0x000000E5r; // "R windshield" //
		stock_parts_list_Rr[ 3] = cars.racers.Axis:0x000000E3r; // "R seats" //
		stock_parts_list_Rr[ 4] = cars.racers.Axis:0x000000E8r; // "RL window" //
		stock_parts_list_Rr[ 5] = cars.racers.Axis:0x000000E9r; // "RR window" //

		stock_parts_list_L  = new int[7];
		stock_parts_list_L[ 0] = cars.racers.Axis:0x000000DCr; // "L sideskirt" //
		stock_parts_list_L[ 1] = cars.racers.Axis:0x000000D2r; // "FL door" //
		stock_parts_list_L[ 2] = cars.racers.Axis:0x000000D4r; // "FL window" //
		stock_parts_list_L[ 3] = cars.racers.Axis:0x000000DBr; // "L mirror" //
		stock_parts_list_L[ 4] = cars.racers.Axis:0x000000D3r; // "FL seat" //
		stock_parts_list_L[ 5] = cars.racers.Axis:0x000000F3r; // "L headlights" //
		stock_parts_list_L[ 6] = cars.racers.Axis:0x000000DEr; // "L taillights" //

		stock_parts_list_R  = new int[7];
		stock_parts_list_R[ 0] = cars.racers.Axis:0x000000F0r; // "R sideskirt" //
		stock_parts_list_R[ 1] = cars.racers.Axis:0x000000D5r; // "FR door" //
		stock_parts_list_R[ 2] = cars.racers.Axis:0x000000D7r; // "FR window" //
		stock_parts_list_R[ 3] = cars.racers.Axis:0x000000E2r; // "R mirror" //
		stock_parts_list_R[ 4] = cars.racers.Axis:0x000000D6r; // "FR seat" //
		stock_parts_list_R[ 5] = cars.racers.Axis:0x000000F1r; // "R headlights" //
		stock_parts_list_R[ 6] = cars.racers.Axis:0x000000F6r; // "R taillights" //

		// stage 1 stuffs //

		stg_1_parts_list_FL = new int[1];
		stg_1_parts_list_FL[ 0] = cars.racers.Axis:0x000000F3r; // "L headlights" //

		stg_1_parts_list_FR = new int[1];
		stg_1_parts_list_FR[ 0] = cars.racers.Axis:0x000000F1r; // "R headlights" //

		stg_1_parts_list_RL = new int[1];
		stg_1_parts_list_RL[ 0] = cars.racers.Axis:0x000000DEr; // "L taillights" //

		stg_1_parts_list_RR = new int[1];
		stg_1_parts_list_RR[ 0] = cars.racers.Axis:0x000000F6r; // "R taillights" //

		stg_1_parts_list_F  = new int[4];
		stg_1_parts_list_F[ 0] = cars.racers.Axis:0x000000CEr; // "F bumper 2" //
		stg_1_parts_list_F[ 1] = cars.racers.Axis:0x000000D9r; // "hood 2" //
		stg_1_parts_list_F[ 2] = cars.racers.Axis:0x000000D1r; // "F windshield" //
		stg_1_parts_list_F[ 3] = cars.racers.Axis:0x000000D0r; // "F grill" //

		stg_1_parts_list_Rr = new int[6];
		stg_1_parts_list_Rr[ 0] = cars.racers.Axis:0x000000E0r; // "R bumper 2" //
		stg_1_parts_list_Rr[ 1] = cars.racers.Axis:0x000000EAr; // "trunk" //
		stg_1_parts_list_Rr[ 2] = cars.racers.Axis:0x000000E6r; // "R wing" //
		stg_1_parts_list_Rr[ 3] = cars.racers.Axis:0x000000E5r; // "R windshield" //
		stg_1_parts_list_Rr[ 4] = cars.racers.Axis:0x000000E8r; // "RL window" //
		stg_1_parts_list_Rr[ 5] = cars.racers.Axis:0x000000E9r; // "RR window" //

		stg_1_parts_list_L  = new int[5];
		stg_1_parts_list_L[ 0] = cars.racers.Axis:0x000000F2r; // "L sideskirt 2" //
		stg_1_parts_list_L[ 1] = cars.racers.Axis:0x000000D2r; // "FL door" //
		stg_1_parts_list_L[ 2] = cars.racers.Axis:0x000000D4r; // "FL window" //
		stg_1_parts_list_L[ 3] = cars.racers.Axis:0x000000F4r; // "L mirror 2" //
		stg_1_parts_list_L[ 4] = cars.racers.Axis:0x000000D3r; // "FL seat" //

		stg_1_parts_list_R  = new int[5];
		stg_1_parts_list_R[ 0] = cars.racers.Axis:0x000000EFr; // "R sideskirt 2" //
		stg_1_parts_list_R[ 1] = cars.racers.Axis:0x000000D5r; // "FR door" //
		stg_1_parts_list_R[ 2] = cars.racers.Axis:0x000000D7r; // "FR window" //
		stg_1_parts_list_R[ 3] = cars.racers.Axis:0x000000F5r; // "R mirror 2" //
		stg_1_parts_list_R[ 4] = cars.racers.Axis:0x000000D6r; // "FR seat" //

		// running gear parts lists //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x000030FCr; // "SS_15_FL_McPherson" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x00003147r; // "SS_15_FR_McPherson" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x0000314Ar; // "SS_15_RL_Trailing-arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x0000315Dr; // "SS_15_RR_Trailing-arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x0000005Fr; // "SS_15_6100_N/m/s" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x00000061r; // "SS_15_5700_N/m/s" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x00000002r; // "SS_15_7.2_kgfpm_9in" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x00000005r; // "SS_15_7.2_kgfpm_9.5in" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x00000167r; // "SS_15_265mm_2caliper" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x00000168r; // "SS_15_235mm_2caliper" //

		stock_parts_list_RGear_sways = new int[2];
		stock_parts_list_RGear_sways[ 0] = parts:0x000041FFr; // "SS_15_25000Nm_2500Nms front" //
		stock_parts_list_RGear_sways[ 1] = parts:0x0000017Cr; // "SS_15_25000Nm_2500Nms rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x000002BAr; //rim_MT_Mescaline_10_0_15_ET__40_LOD_CATALOG_GARAGE
		stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x000002BAr; //rim_MT_Mescaline_10_0_15_ET__40_LOD_CATALOG_GARAGE

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x0000042Dr; //tyre_215_50_15_8_0_LOD_CATALOG_GARAGE
		stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x0000042Dr; //tyre_215_50_15_8_0_LOD_CATALOG_GARAGE
		
		super.addStockParts( desc );

		addPart( cars.racers.Axis:0x0000FFB4r, "steering wheel" );
		addPart( parts.pedals:0x0000BB01r, "stock pedals manual" );

		if (desc.power > 1.8)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.8)/0.2*0.700+0.300),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);

			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001BFr, "24pds canister" );
		}

		if (desc.power > 1.4)
		{
			addPart( cars.racers.Axis:0x000000F7r, "turbo_exhaust_pipe" );
			addPart( parts.mufflers:0x0000001Br, "muffler type 08" );
		}
		else
		{
			addPart( cars.racers.Axis:0x000000F8r, "stock_exhaust_pipe" );
			addPart( parts.mufflers:0x0000001Br, "muffler type 08" );
		}
	}
}