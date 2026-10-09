package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Yotta_3_6_TwinTurbo extends Yotta_models
{
	public Yotta_3_6_TwinTurbo( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Baiern Cars Gmbh";
		vendorName = "Yotta";
		model = MODEL_3_6_TWINTURBO;
		modelName = "3.6 TwinTurbo";
		vehicleName = "Baiern " + vendorName +  " " + modelName;
		policeName = "Baiern " + vendorName +  " police car";
		name = getName();

		description = "An improved Yotta now comes with the new 3.6L twin-turbocharged 553HP engine and the enhanced suspension that ensures better stability when driving at high speeds.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(3.776);
		brand_new_prestige_value = 35.73;
 
		fully_stripped_drag = 0.55;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(998));

		L_stock_door_slot = 7; //stock driver's door
		R_stock_door_slot = 17; //stock passenger's door

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
		// stock 1 stuffs //

		stock_parts_list_E  = new int[2];
		stock_parts_list_E[0] = parts.engines.Baiern_Emer:0x00000052r; // "3.6 i6" //
		stock_parts_list_E[1] = parts:0x000000E9r; // "silver 65ah battery" //

		stock_parts_list_FL = new int[1];
		stock_parts_list_FL[0] = cars.racers.Yotta:0x000000D8r; // "L headlights" //

		stock_parts_list_FR = new int[1];
		stock_parts_list_FR[0] = cars.racers.Yotta:0x000000DAr; // "R headlights" //

		stock_parts_list_RL = new int[1];
		stock_parts_list_RL[0] = cars.racers.Yotta:0x000000CDr; // "L taillights" //

		stock_parts_list_RR = new int[1];
		stock_parts_list_RR[0] = cars.racers.Yotta:0x000000DBr; // "R taillights" //

		stock_parts_list_F  = new int[4];
		stock_parts_list_F[0] = cars.racers.Yotta:0x000000DDr; // "F bumper" //
		stock_parts_list_F[1] = cars.racers.Yotta:0x000000E1r; // "hood" //
		stock_parts_list_F[2] = cars.racers.Yotta:0x000000CFr; // "F windshield" //
		stock_parts_list_F[3] = cars.racers.Yotta:0x000000CCr; // "Targa top" //

		stock_parts_list_Rr = new int[4];
		stock_parts_list_Rr[0] = cars.racers.Yotta:0x000000C9r; // "R bumper" //
		stock_parts_list_Rr[1] = cars.racers.Yotta:0x000000CBr; // "trunk" //
		stock_parts_list_Rr[2] = cars.racers.Yotta:0x000000D0r; // "R windshield" //
		stock_parts_list_Rr[3] = cars.racers.Yotta:0x000000CEr; // "R seats" //

		stock_parts_list_L  = new int[6];
		stock_parts_list_L[0] = cars.racers.Yotta:0x000000CAr; // "L sideskirt" //
		stock_parts_list_L[1] = cars.racers.Yotta:0x000000C8r; // "FL door" //
		stock_parts_list_L[2] = cars.racers.Yotta:0x000000D6r; // "L mirror" //
		stock_parts_list_L[3] = cars.racers.Yotta:0x000000D1r; // "FL window" //
		stock_parts_list_L[4] = cars.racers.Yotta:0x000000D3r; // "RL window" //
		stock_parts_list_L[5] = cars.racers.Yotta:0x000000EEr; // "FL seat" //

		stock_parts_list_R  = new int[6];
		stock_parts_list_R[0] = cars.racers.Yotta:0x000000D5r; // "R sideskirt" //
		stock_parts_list_R[1] = cars.racers.Yotta:0x000000DCr; // "FR door" //
		stock_parts_list_R[2] = cars.racers.Yotta:0x000000D9r; // "R mirror" //
		stock_parts_list_R[3] = cars.racers.Yotta:0x000000D2r; // "FR window" //
		stock_parts_list_R[4] = cars.racers.Yotta:0x000000D4r; // "RR window" //
		stock_parts_list_R[5] = cars.racers.Yotta:0x000000EFr; // "FR seat" //

/////////////////////

		stg_1_parts_list_FL = new int[1];
		stg_1_parts_list_FL[0] = cars.racers.Yotta:0x000000D8r; // "L headlights" //

		stg_1_parts_list_FR = new int[1];
		stg_1_parts_list_FR[0] = cars.racers.Yotta:0x000000DAr; // "R headlights" //

		stg_1_parts_list_RL = new int[1];
		stg_1_parts_list_RL[0] = cars.racers.Yotta:0x000000CDr; // "L taillights" //

		stg_1_parts_list_RR = new int[1];
		stg_1_parts_list_RR[0] = cars.racers.Yotta:0x000000DBr; // "R taillights" //

		stg_1_parts_list_F  = new int[4];
		stg_1_parts_list_F[0] = cars.racers.Yotta:0x000000E5r; // "F bumper 2" //
		stg_1_parts_list_F[1] = cars.racers.Yotta:0x000000E1r; // "hood 2" //
		stg_1_parts_list_F[2] = cars.racers.Yotta:0x000000CFr; // "F windshield" //
		stg_1_parts_list_F[3] = cars.racers.Yotta:0x000000CCr; // "Targa top" //

		stg_1_parts_list_Rr = new int[5];
		stg_1_parts_list_Rr[0] = cars.racers.Yotta:0x000000E0r; // "R bumper 2" //
		stg_1_parts_list_Rr[1] = cars.racers.Yotta:0x000000CBr; // "trunk" //
		stg_1_parts_list_Rr[2] = cars.racers.Yotta:0x000000EBr; // "R wing 2" //
		stg_1_parts_list_Rr[3] = cars.racers.Yotta:0x000000D0r; // "R windshield" //
		stg_1_parts_list_Rr[4] = cars.racers.Yotta:0x000000CEr; // "R seats" //

		stg_1_parts_list_L  = new int[6];
		stg_1_parts_list_L[0] = cars.racers.Yotta:0x000000DEr; // "L sideskirt 2" //
		stg_1_parts_list_L[1] = cars.racers.Yotta:0x000000C8r; // "FL door" //
		stg_1_parts_list_L[2] = cars.racers.Yotta:0x000000E2r; // "L mirror 2" //
		stg_1_parts_list_L[3] = cars.racers.Yotta:0x000000D1r; // "FL window" //
		stg_1_parts_list_L[4] = cars.racers.Yotta:0x000000D3r; // "RL window" //
		stg_1_parts_list_L[5] = cars.racers.Yotta:0x000000EEr; // "FL seat" //

		stg_1_parts_list_R  = new int[6];
		stg_1_parts_list_R[0] = cars.racers.Yotta:0x000000E3r; // "R sideskirt 2" //
		stg_1_parts_list_R[1] = cars.racers.Yotta:0x000000DCr; // "FR door" //
		stg_1_parts_list_R[2] = cars.racers.Yotta:0x000000E4r; // "R mirror 2" //
		stg_1_parts_list_R[3] = cars.racers.Yotta:0x000000D2r; // "FR window" //
		stg_1_parts_list_R[4] = cars.racers.Yotta:0x000000D4r; // "RR window" //
		stg_1_parts_list_R[5] = cars.racers.Yotta:0x000000EFr; // "FR seat" //

		stg_2_parts_list_FL = new int[1];
		stg_2_parts_list_FL[0] = cars.racers.Yotta:0x000000D8r; // "L headlights" //

		stg_2_parts_list_FR = new int[1];
		stg_2_parts_list_FR[0] = cars.racers.Yotta:0x000000DAr; // "R headlights" //

		stg_2_parts_list_RL = new int[1];
		stg_2_parts_list_RL[0] = cars.racers.Yotta:0x000000CDr; // "L taillights" //

		stg_2_parts_list_RR = new int[1];
		stg_2_parts_list_RR[0] = cars.racers.Yotta:0x000000DBr; // "R taillights" //

		stg_2_parts_list_F  = new int[4];
		stg_2_parts_list_F[0] = cars.racers.Yotta:0x000000ECr; // "F bumper 3" //
		stg_2_parts_list_F[1] = cars.racers.Yotta:0x000000E6r; // "hood 3" //
		stg_2_parts_list_F[2] = cars.racers.Yotta:0x000000CFr; // "F windshield" //
		stg_2_parts_list_F[3] = cars.racers.Yotta:0x000000CCr; // "Targa top" //

		stg_2_parts_list_Rr = new int[5];
		stg_2_parts_list_Rr[0] = cars.racers.Yotta:0x000000EDr; // "R bumper 3" //
		stg_2_parts_list_Rr[1] = cars.racers.Yotta:0x000000CBr; // "trunk" //
		stg_2_parts_list_Rr[2] = cars.racers.Yotta:0x000000EBr; // "R wing 2" //
		stg_2_parts_list_Rr[3] = cars.racers.Yotta:0x000000D0r; // "R windshield" //
		stg_2_parts_list_Rr[4] = cars.racers.Yotta:0x000000CEr; // "R seats" //

		stg_2_parts_list_L  = new int[6];
		stg_2_parts_list_L[0] = cars.racers.Yotta:0x000000E8r; // "L sideskirt 3" //
		stg_2_parts_list_L[1] = cars.racers.Yotta:0x000000C8r; // "FL door" //
		stg_2_parts_list_L[2] = cars.racers.Yotta:0x000000E9r; // "L mirror 3" //
		stg_2_parts_list_L[3] = cars.racers.Yotta:0x000000D1r; // "FL window" //
		stg_2_parts_list_L[4] = cars.racers.Yotta:0x000000D3r; // "RL window" //
		stg_2_parts_list_L[5] = cars.racers.Yotta:0x000000EEr; // "FL seat" //

		stg_2_parts_list_R  = new int[6];
		stg_2_parts_list_R[0] = cars.racers.Yotta:0x000000E7r; // "R sideskirt 3" //
		stg_2_parts_list_R[1] = cars.racers.Yotta:0x000000DCr; // "FR door" //
		stg_2_parts_list_R[2] = cars.racers.Yotta:0x000000EAr; // "R mirror 3" //
		stg_2_parts_list_R[3] = cars.racers.Yotta:0x000000D2r; // "FR window" //
		stg_2_parts_list_R[4] = cars.racers.Yotta:0x000000D4r; // "RR window" //
		stg_2_parts_list_R[5] = cars.racers.Yotta:0x000000EFr; // "FR seat" //

		if (desc.power < 1.3)
		{
			stock_parts_list_RGear_shocks = new int[4];
			stock_parts_list_RGear_shocks[0] = stock_parts_list_RGear_shocks[1] = parts:0x000000E7r; // "shock_absorber_Baiern_DS_front" //
			stock_parts_list_RGear_shocks[2] = stock_parts_list_RGear_shocks[3] = parts:0x000000EBr; // "shock_absorber_Baiern_DS_rear" //

			stock_parts_list_RGear_springs = new int[4];
			stock_parts_list_RGear_springs[0] = stock_parts_list_RGear_springs[1] = parts:0x000000F0r; // "spring_Baiern_DS_front" //
			stock_parts_list_RGear_springs[2] = stock_parts_list_RGear_springs[3] = parts:0x000000F1r; // "spring_Baiern_DS_rear" //

			stock_parts_list_RGear_brakes = new int[4];
			stock_parts_list_RGear_brakes[0] = stock_parts_list_RGear_brakes[1] = parts:0x000000D8r; // "brake_Baiern_DS_front" //
			stock_parts_list_RGear_brakes[2] = stock_parts_list_RGear_brakes[3] = parts:0x000000D9r; // "brake_Baiern_DS_rear" //

			stock_parts_list_RGear_sways = new int[2];
			stock_parts_list_RGear_sways[0] = parts:0x0000021Dr; // "swaybar_Baiern_GT_front" //
			stock_parts_list_RGear_sways[1] = parts:0x0000021Er; // "swaybar_Baiern_GT_rear" //

			stock_parts_list_RGear_wheels = new int[4];
			stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x000003ACr; // "rim Blossom 9.0 19 ET 0 LOD CATALOG GARAGE" //
			stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x000003ACr; // "rim Blossom 9.0 19 ET 0 LOD CATALOG GARAGE" //

			stock_parts_list_RGear_tyres = new int[4];
			stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x000003E5r; // "235_45_19_sport" //
			stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x000003E5r; // "235_45_19_sport" //

			stock_parts_list_RGear_suspensions = new int[4];
			stock_parts_list_RGear_suspensions[0] = parts:0x0000010Cr; // "Baiern_DS_FL_McPherson_strut" //
			stock_parts_list_RGear_suspensions[1] = parts:0x0000010Dr; // "Baiern_DS_FR_McPherson_strut" //
			stock_parts_list_RGear_suspensions[2] = parts:0x0000010Er; // "Baiern_DS_RL_trailing_arm" //
			stock_parts_list_RGear_suspensions[3] = parts:0x0000010Fr; // "Baiern_DS_RR_trailing_arm" //
		}
		else
		{
			stock_parts_list_RGear_shocks = new int[4];
			stock_parts_list_RGear_shocks[0] = stock_parts_list_RGear_shocks[1] = parts:0x000000ECr; // "shock_absorber_Baiern_GT_front" //
			stock_parts_list_RGear_shocks[2] = stock_parts_list_RGear_shocks[3] = parts:0x000000EDr; // "shock_absorber_Baiern_GT_rear" //

			stock_parts_list_RGear_springs = new int[4];
			stock_parts_list_RGear_springs[0] = stock_parts_list_RGear_springs[1] = parts:0x000000F2r; // "spring_Baiern_GT_front" //
			stock_parts_list_RGear_springs[2] = stock_parts_list_RGear_springs[3] = parts:0x000000F1r; // "spring_Baiern_GT_rear" //

			stock_parts_list_RGear_brakes = new int[4];
			stock_parts_list_RGear_brakes[0] = stock_parts_list_RGear_brakes[1] = parts:0x000000DAr; // "brake_Baiern_GT_front" //
			stock_parts_list_RGear_brakes[2] = stock_parts_list_RGear_brakes[3] = parts:0x000000DBr; // "brake_Baiern_GT_front" //

			stock_parts_list_RGear_sways = new int[2];
			stock_parts_list_RGear_sways[0] = parts:0x0000021Dr; // "swaybar_Baiern_GT_front" //
			stock_parts_list_RGear_sways[1] = parts:0x0000021Er; // "swaybar_Baiern_GT_rear" //

			stock_parts_list_RGear_wheels = new int[4];
			stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x00000400r; // rim Baiern_DTM 11.0 19 ET -25 LOD CATALOG GARAGE
			stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x00000400r; // rim Baiern_DTM 11.0 19 ET -25 LOD CATALOG GARAGE

			stock_parts_list_RGear_tyres = new int[4];
			stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x00000404r; // tyre 255 25 19 11.0 LOD CATALOG GARAGE
			stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x00000404r; // tyre 255 25 19 11.0 LOD CATALOG GARAGE

			stock_parts_list_RGear_suspensions = new int[4];
			stock_parts_list_RGear_suspensions[0] = parts:0x000000F4r; // Baiern_GT_FL_McPherson_strut"//
			stock_parts_list_RGear_suspensions[1] = parts:0x000000F5r; // Baiern_GT_FR_McPherson_strut"//
			stock_parts_list_RGear_suspensions[2] = parts:0x000000F6r; // "Baiern_GT_RL_trailing_arm"//
			stock_parts_list_RGear_suspensions[3] = parts:0x000000F7r; // Baiern_GT_RL_trailing_arm"//
		}
		
		super.addStockParts( desc );
		
		addPart( cars.racers.Yotta:0x0000FFB4r, "steering wheel" );
		addPart( parts.pedals:0x0000BB02r, "stock pedals auto" );

		addPart( cars.racers.Yotta:0x000000F5r, "stock_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );

		if (desc.power > 1.3)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Baiern_Emer:0x00000051r, "i6 NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.3)/0.7*0.500+0.200),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);

			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001BFr, "24pds canister" );
			
			if (desc.power > 1.8)
			{
				addPart( parts:0x000001C1r, "12pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
			}
		}
	}
}
