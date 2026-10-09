package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Kurumma_Z3 extends Kurumma_models
{
	public Kurumma_Z3( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Muscle Cars America";
		vendorName = "Kurumma";
		model = MODEL_Z3;
		modelName = "Z3";
		vehicleName = "MCA " + vendorName + " " + modelName;
		name = getName();

		description = "In 1998 MCA launched a small line of a stylish modern cars with a name Kurumma. The Z3 model has a 3.8L V6 288HP engine by the special licence from SL Tuners. The 1538kg car stands well on a classic MCA suspension ensuring a good handling what is very important for a potential buyer.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(3.017);
		brand_new_prestige_value = 34.03;
 
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
		stock_parts_list_E[ 1] = parts:0x000053FFr; // "stock battery" //

		stock_parts_list_FL = new int[1];
		stock_parts_list_FL[ 0] = cars.racers.Kurumma:0x000000D4r; // "L headlights" //

		stock_parts_list_FR = new int[1];
		stock_parts_list_FR[ 0] = cars.racers.Kurumma:0x000000D9r; // "R headlights" //

		stock_parts_list_RL = new int[1];
		stock_parts_list_RL[ 0] = cars.racers.Kurumma:0x000000D7r; // "L taillights" //

		stock_parts_list_RR = new int[1];
		stock_parts_list_RR[ 0] = cars.racers.Kurumma:0x000000DBr; // "R taillights" //

		stock_parts_list_F  = new int[4];
		stock_parts_list_F[ 0] = cars.racers.Kurumma:0x000000C6r; // "F bumper" //
		stock_parts_list_F[ 1] = cars.racers.Kurumma:0x000000C9r; // "F grill" //
		stock_parts_list_F[ 2] = cars.racers.Kurumma:0x000000D1r; // "hood" //
		stock_parts_list_F[ 3] = cars.racers.Kurumma:0x000000CAr; // "F windshield" //

		stock_parts_list_Rr = new int[3];
		stock_parts_list_Rr[ 0] = cars.racers.Kurumma:0x000000D8r; // "R bumper" //
		stock_parts_list_Rr[ 1] = cars.racers.Kurumma:0x000000DDr; // "trunk" //
		stock_parts_list_Rr[ 2] = cars.racers.Kurumma:0x000000DCr; // "R windshield" //

		stock_parts_list_L  = new int[5];
		stock_parts_list_L[ 0] = cars.racers.Kurumma:0x000000CBr; // "FL door" //
		stock_parts_list_L[ 1] = cars.racers.Kurumma:0x000000CCr; // "FL seat" //
		stock_parts_list_L[ 2] = cars.racers.Kurumma:0x000000CDr; // "FL window" //
		stock_parts_list_L[ 3] = cars.racers.Kurumma:0x000000D5r; // "L mirror" //
		stock_parts_list_L[ 4] = cars.racers.Kurumma:0x000000D6r; // "L sideskirt" //

		stock_parts_list_R  = new int[5];
		stock_parts_list_R[ 0] = cars.racers.Kurumma:0x000000CEr; // "FR door" //
		stock_parts_list_R[ 1] = cars.racers.Kurumma:0x000000CFr; // "FR seat" //
		stock_parts_list_R[ 2] = cars.racers.Kurumma:0x000000D0r; // "FR window" //
		stock_parts_list_R[ 3] = cars.racers.Kurumma:0x000000DAr; // "R mirror" //
		stock_parts_list_R[ 4] = cars.racers.Kurumma:0x000000E4r; // "R sideskirt" //

		// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x000001FCr; // "MC_GT_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x000001FDr; // "MC_GT_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x000001FEr; // "MC_GT_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x000001FFr; // "MC_GT_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x000001B4r; // "shock_absorber_MC_GT_front" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x000001B5r; // "shock_absorber_MC_GT_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x000001DEr; // "spring_MC_GT_front" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x000001DFr; // "spring_MC_GT_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x0000015Er; // "brake_MC_GT_front" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x0000016Fr; // "brake_MC_GT_rear" //

		stock_parts_list_RGear_sways = new int[2];
		stock_parts_list_RGear_sways[ 0] = parts:0x00000199r; // "swaybar_MC_GT_front" //
		stock_parts_list_RGear_sways[ 1] = parts:0x0000019Ar; // "swaybar_MC_GT_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[ 0] = stock_parts_list_RGear_wheels[ 1] = parts.wheels:0x000002BEr; // "rim MT_Mescaline 9.0 15 ET -20 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[ 2] = stock_parts_list_RGear_wheels[ 3] = parts.wheels:0x000002BAr; // "rim MT_Mescaline 10.0 15 ET -40 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[ 0] = stock_parts_list_RGear_tyres[ 1] = parts.wheels:0x0000042Dr; // "tyre 215 50 15 8.0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[ 2] = stock_parts_list_RGear_tyres[ 3] = parts.wheels:0x0000042Br; // "tyre 255 50 15 9.5 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( cars.racers.Kurumma:0x0000FFB4r, "steering wheel" );
		addPart( parts.pedals:0x0000BB02r, "stock pedals auto" );

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
