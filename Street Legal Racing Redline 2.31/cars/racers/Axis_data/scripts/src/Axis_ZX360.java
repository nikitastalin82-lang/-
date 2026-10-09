package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Axis_ZX360 extends Axis_models
{
	public Axis_ZX360( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Duhen Incorporated";
		vendorName = "Axis";
		model = MODEL_ZX360;
		modelName = "ZX360";
		vehicleName = "Duhen " + vendorName + " " +  modelName;
		policeName = "Duhen " + vendorName + " police car";
		name = getName();

		description = "Being a top model of Axis series, ZX360 was designed especially for tuners. Stock configuration gives a basic set: light ZX360 aerodynamic bodykit, racing suspension from Duhen Inc., 2.2L 202HP engine with automatic transmission and a light chassis with additionally adjusted center of mass. As you see, it's good enough in stock, few more improvements and it's gonna become good in racing.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(3.310);
		brand_new_prestige_value = 35.42;
 
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
		// stock 1 stuffs //
		stock_parts_list_E  = new int[2];
		stock_parts_list_E[ 0] = parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000000Ar; // "Duhen D22V I-4" //
		stock_parts_list_E[ 1] = parts:0x000000E9r; // "silver 65ah battery" //

		stock_parts_list_F  = new int[5];
		stock_parts_list_F[ 0] = cars.racers.Axis:0x000000CFr; // "F bumper 3" //
		stock_parts_list_F[ 1] = cars.racers.Axis:0x000000DAr; // "hood 3" //
		stock_parts_list_F[ 2] = cars.racers.Axis:0x000000D0r; // "F grill" //
		stock_parts_list_F[ 3] = cars.racers.Axis:0x000000D1r; // "F windshield" //
		stock_parts_list_F[ 4] = cars.racers.Axis:0x000000E7r; // "R wing 2" //

		stock_parts_list_Rr = new int[5];
		stock_parts_list_Rr[ 0] = cars.racers.Axis:0x000000E1r; // "R bumper 3" //
		stock_parts_list_Rr[ 1] = cars.racers.Axis:0x000000EAr; // "trunk" //
		stock_parts_list_Rr[ 2] = cars.racers.Axis:0x000000E5r; // "R windshield" //
		stock_parts_list_Rr[ 3] = cars.racers.Axis:0x000000E8r; // "RL window" //
		stock_parts_list_Rr[ 4] = cars.racers.Axis:0x000000E9r; // "RR window" //

		stock_parts_list_L  = new int[7];
		stock_parts_list_L[ 0] = cars.racers.Axis:0x000000DDr; // "L sideskirt 3" //
		stock_parts_list_L[ 1] = cars.racers.Axis:0x000000D2r; // "FL door" //
		stock_parts_list_L[ 2] = cars.racers.Axis:0x000000D4r; // "FL window" //
		stock_parts_list_L[ 3] = cars.racers.Axis:0x000000F4r; // "L mirror 2" //
		stock_parts_list_L[ 4] = cars.racers.Axis:0x000000F3r; // "L headlights" //
		stock_parts_list_L[ 5] = cars.racers.Axis:0x000000DEr; // "L taillights" //
		stock_parts_list_L[ 6] = parts.interior:0x00000049r; // "FL seat" //

		stock_parts_list_R  = new int[7];
		stock_parts_list_R[ 0] = cars.racers.Axis:0x000000E4r; // "R sideskirt 3" //
		stock_parts_list_R[ 1] = cars.racers.Axis:0x000000D5r; // "FR door" //
		stock_parts_list_R[ 2] = cars.racers.Axis:0x000000D7r; // "FR window" //
		stock_parts_list_R[ 3] = cars.racers.Axis:0x000000F5r; // "R mirror 2" //
		stock_parts_list_R[ 4] = cars.racers.Axis:0x000000F1r; // "R headlights" //
		stock_parts_list_R[ 5] = cars.racers.Axis:0x000000F6r; // "R taillights" //
		stock_parts_list_R[ 6] = parts.interior:0x00000049r; // "FR seat" //

		// running gear parts lists //

		// stock 1 stuffs //
		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x0000316Ar; // "SunStrip_20_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x0000316Br; // "SunStrip_20_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x0000316Cr; // "SunStrip_20_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x0000316Dr; // "SunStrip_20_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x0000006Br; // "shock_absorber_SunStrip_20_front" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x0000006Cr; // "shock_absorber_SunStrip_20_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x00000015r; // "spring_SunStrip_20_front" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x0000005Dr; // "spring_SunStrip_20_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x0000016Dr; // "brake_SunStrip_20_front" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x0000016Er; // "brake_SunStrip_20_rear" //

		stock_parts_list_RGear_sways = new int[2];
		stock_parts_list_RGear_sways[ 0] = parts:0x00000182r; // "swaybar_SunStrip_20_front" //
		stock_parts_list_RGear_sways[ 1] = parts:0x00000184r; // "swaybar_SunStrip_20_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x000002BAr; //rim_MT_Mescaline_10_0_15_ET__40_LOD_CATALOG_GARAGE
		stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x000002BAr; //rim_MT_Mescaline_10_0_15_ET__40_LOD_CATALOG_GARAGE

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x0000042Dr; //tyre_215_50_15_8_0_LOD_CATALOG_GARAGE
		stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x0000042Dr; //tyre_215_50_15_8_0_LOD_CATALOG_GARAGE

		super.addStockParts( desc );
		
		addPart( cars.racers.Axis:0x000000F7r, "turbo_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Br, "muffler type 08" );

		addPart( cars.racers.Axis:0x0000FFB4r, "steering wheel" );
		addPart( parts.pedals:0x0000BB02r, "stock pedals auto" );

		if (desc.power > 1.8)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.8)/0.2*0.700+0.300),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);

			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001BFr, "24pds canister" );
		}
	}
}