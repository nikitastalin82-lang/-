package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Kurumma_Z35C extends Kurumma_models
{
	public Kurumma_Z35C( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Muscle Cars America";
		vendorName = "Kurumma";
		model = MODEL_Z35C;
		modelName = "Z35C";
		vehicleName = "MCA " + vendorName + " " + modelName;
		policeName = "MCA " + vendorName + " police car";
		name = getName();

		description = "In the year 2000 MCA put a racing version of their Kurumma Z3 under the name Z35C. The new model gained a 4.2L V6 engine with an unbeliveable 549HP of power. In addition, MCA balanced the chassis and replaced the stock wheels by the 19-inch light alloy ones featuring soft slick tyres. And finally, the new bodykit makes this car looking like a racer's dream. Besides, it's still rare and expensive so you won't meet too much of Z35C on the streets.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(4.477);
		brand_new_prestige_value = 35.73;
 
		fully_stripped_drag = 0.55;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(28));
		exhaustSlotIDList.addElement(new Integer(29));

		L_stock_door_slot = 10; //stock driver's door
		R_stock_door_slot = 11; //stock passenger's door

		L_scissor_door_slot = 650; //scissor driver's door
		R_scissor_door_slot = 651; //scissor passenger's door

		L_suicide_door_slot = 653; //suicide driver's door
		R_suicide_door_slot = 652; //suicide passenger's door

		L_butterfly_door_slot = 654; //butterfly driver's door
		R_butterfly_door_slot = 655; //butterfly passenger's door

//		L_custom_door_slot = 658; //custom driver's door
//		R_custom_door_slot = 657; //custom passenger's door
	}

	public void addStockParts( Descriptor desc )
	{
		stock_parts_list_E  = new int[2];
		stock_parts_list_E[ 0] = parts.engines.GMC_Nissan_Honda_Hyundai_Opel:0x0000000Ar; // "American V6" //
		stock_parts_list_E[ 1] = parts:0x000000E8r; // "blue 55ah battery" //

		stock_parts_list_FL = new int[1];
		stock_parts_list_FL[ 0] = cars.racers.Kurumma:0x000000D4r; // "L headlights" //

		stock_parts_list_FR = new int[1];
		stock_parts_list_FR[ 0] = cars.racers.Kurumma:0x000000D9r; // "R headlights" //

		stock_parts_list_RL = new int[1];
		stock_parts_list_RL[ 0] = cars.racers.Kurumma:0x000000D7r; // "L taillights" //

		stock_parts_list_RR = new int[1];
		stock_parts_list_RR[ 0] = cars.racers.Kurumma:0x000000DBr; // "R taillights" //

		stock_parts_list_F  = new int[4];
		stock_parts_list_F[ 0] = cars.racers.Kurumma:0x000000C7r; // "F bumper 2" //
		stock_parts_list_F[ 1] = cars.racers.Kurumma:0x000000C9r; // "F grill" //
		stock_parts_list_F[ 2] = cars.racers.Kurumma:0x000000D2r; // "hood 2" //
		stock_parts_list_F[ 3] = cars.racers.Kurumma:0x000000CAr; // "F windshield" //

		stock_parts_list_Rr = new int[3];
		stock_parts_list_Rr[ 0] = cars.racers.Kurumma:0x000000E0r; // "R bumper 2" //
		stock_parts_list_Rr[ 1] = cars.racers.Kurumma:0x000000DEr; // "trunk 2" //
		stock_parts_list_Rr[ 2] = cars.racers.Kurumma:0x000000DCr; // "R windshield" //

		stock_parts_list_L  = new int[5];
		stock_parts_list_L[ 0] = cars.racers.Kurumma:0x000000CBr; // "FL door" //
		stock_parts_list_L[ 1] = parts.interior:0x00000049r; // "FL seat" //
		stock_parts_list_L[ 2] = cars.racers.Kurumma:0x000000CDr; // "FL window" //
		stock_parts_list_L[ 3] = cars.racers.Kurumma:0x000000D5r; // "L mirror" //
		stock_parts_list_L[ 4] = cars.racers.Kurumma:0x000000E3r; // "L sideskirt 2" //

		stock_parts_list_R  = new int[5];
		stock_parts_list_R[ 0] = cars.racers.Kurumma:0x000000CEr; // "FR door" //
		stock_parts_list_R[ 1] = parts.interior:0x00000049r; // "FR seat" //
		stock_parts_list_R[ 2] = cars.racers.Kurumma:0x000000D0r; // "FR window" //
		stock_parts_list_R[ 3] = cars.racers.Kurumma:0x000000DAr; // "R mirror" //
		stock_parts_list_R[ 4] = cars.racers.Kurumma:0x000000E5r; // "R sideskirt 2" //

		// running gear parts lists //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x000000F4r; // "Baiern_GT_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x000000F5r; // "Baiern_GT_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x000000F6r; // "Baiern_GT_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x000000F7r; // "Baiern_GT_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x000000ECr; // "shock_absorber_Baiern_GT_front" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x000000EDr; // "shock_absorber_Baiern_GT_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x000000F2r; // "spring_Baiern_GT_front" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x000000F3r; // "spring_Baiern_GT_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x000000DAr; // "brake_Baiern_GT_front" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x000000DBr; // "brake_Baiern_GT_rear" //

		stock_parts_list_RGear_sways = new int[2];
		stock_parts_list_RGear_sways[ 0] = parts:0x00000199r; // "swaybar_MC_GT_front" //
		stock_parts_list_RGear_sways[ 1] = parts:0x0000019Ar; // "swaybar_MC_GT_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[ 0] = stock_parts_list_RGear_wheels[ 1] = parts.wheels:0x00000400r; // "rim Baiern_DTM 11.0 19 ET -25 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[ 2] = stock_parts_list_RGear_wheels[ 3] = parts.wheels:0x00000400r; // "rim Baiern_DTM 13.0 19 ET -40 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[ 0] = stock_parts_list_RGear_tyres[ 1] = parts.wheels:0x00000404r; // "tyre 255 25 19 11.0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[ 2] = stock_parts_list_RGear_tyres[ 3] = parts.wheels:0x00000404r; // "tyre 295 20 19 13.0 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( cars.racers.Kurumma:0x0000FFB4r, "steering wheel" );
		addPart( parts.pedals:0x0000BB01r, "stock pedals manual" );

		addPart( cars.racers.Kurumma:0x000000ECr, "stock_L_exhaust_pipe" );
		addPart( cars.racers.Kurumma:0x000000EBr, "stock_R_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );

		if (desc.power > 1.4)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.GMC_Nissan_Honda_Hyundai_Opel:0x000000BFr, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.4)/0.6*0.500+0.500),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);

			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001C1r, "12pds canister" );
			
			if (desc.power > 1.8)
			{
				addPart( parts:0x000001BFr, "24pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
			}
		}
	}
}
