package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Einvagen_140_DTM extends Einvagen_models
{
	public Einvagen_140_DTM( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Einvagen Racing Gmbh";
		vendorName = "Einvagen";
		model = MODEL_140_DTM;
		modelName = "140 DTM";
		vehicleName = vendorName + " " + modelName;
		name = getName();

		description = "German branch of Einvagen Ltd. has presented Einvagen 140 DTM racecar in 2007. Based on 140GTA model, this car has gained a lot of improvements to become competetive in tough DTM conditions, Einvagen engineers believe that compact and light car must be a good alternative for a professional racer.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(52.750);
		brand_new_prestige_value = 40.0;

		fully_stripped_drag = 0.44;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(996));
	}

	public void addStockParts( Descriptor desc )
	{
		stock_parts_list_FL = new int[3];
		stock_parts_list_FL[0] = cars.racers.einvagen:0x000000BAr; // "L headlights" //
		stock_parts_list_FL[1] = cars.racers.einvagen:0x000000B0r; // "FL quarterpanel" //
		stock_parts_list_FL[2] = cars.racers.einvagen:0x0000F311r; // "FL fender sideskirt 2" //

		stock_parts_list_FR = new int[3];
		stock_parts_list_FR[0] = cars.racers.einvagen:0x000000BFr; // "R headlights" //
		stock_parts_list_FR[1] = cars.racers.einvagen:0x000000B4r; // "FR quarterpanel" //
		stock_parts_list_FR[2] = cars.racers.einvagen:0x0000F315r; // "FR fender sideskirt 2" //

		stock_parts_list_RL = new int[2];
		stock_parts_list_RL[0] = cars.racers.einvagen:0x000000BCr; // "L taillights" //
		stock_parts_list_RL[1] = cars.racers.einvagen:0x0000F319r; // "RL fender sideskirt 2" //

		stock_parts_list_RR = new int[2];
		stock_parts_list_RR[0] = cars.racers.einvagen:0x000000C2r; // "R taillights" //
		stock_parts_list_RR[1] = cars.racers.einvagen:0x0000F323r; // "RR fender sideskirt 2" //

		stock_parts_list_F  = new int[4];
		stock_parts_list_F[0] = cars.racers.einvagen:0x0000F303r; // "F bumper 5" //
		stock_parts_list_F[1] = cars.racers.einvagen:0x0000F335r; // "hood 4" //
		stock_parts_list_F[2] = cars.racers.einvagen:0x000000AEr; // "F windshield" //
		stock_parts_list_F[3] = cars.racers.einvagen:0x0000F339r; // "rollcage" //

		stock_parts_list_Rr = new int[4];
		stock_parts_list_Rr[0] = cars.racers.einvagen:0x0000F307r; // "R bumper 3" //
		stock_parts_list_Rr[1] = cars.racers.einvagen:0x0000F347r; // "R door 2" //
		stock_parts_list_Rr[2] = cars.racers.einvagen:0x000000C3r; // "R windshield" //
		stock_parts_list_Rr[3] = cars.racers.einvagen:0x0000F343r; // "R wing 2" //

		stock_parts_list_L  = new int[4];
		stock_parts_list_L[0] = cars.racers.einvagen:0x000000AFr; // "FL door" //
		stock_parts_list_L[1] = cars.racers.einvagen:0x000000C7r; // "RL door" //
		stock_parts_list_L[2] = cars.racers.einvagen:0x0000F327r; // "L sideskirt" //
		stock_parts_list_L[3] = parts.interior:0x0000004Dr; // "FL seat" //

		stock_parts_list_R  = new int[4];
		stock_parts_list_R[0] = cars.racers.einvagen:0x000000B3r; // "FR door" //
		stock_parts_list_R[1] = cars.racers.einvagen:0x000000C9r; // "RR door" //
		stock_parts_list_R[2] = cars.racers.einvagen:0x0000F331r; // "R sideskirt" //
		stock_parts_list_R[3] = parts.interior:0x0000004Dr; // "FR seat" //

//=================================DTM ENGINE START

		stock_parts_list_E  = new int[27];
		stock_parts_list_E[0] = parts.engines.MC_Prime_SuperDuty:0x0000D03Fr; // "DTM_block" //
		stock_parts_list_E[1] = parts.engines.MC_Prime_SuperDuty:0x0000D03Er; // "DTM_crankshaft" //
		stock_parts_list_E[2] = parts.engines.MC_Prime_SuperDuty:0x0000D0FFr; // "DTM_connecting_rods" //
		stock_parts_list_E[3] = parts.engines.MC_Prime_SuperDuty:0x0000D102r; // "DTM_pistons" //
		stock_parts_list_E[4] = parts.engines.MC_Prime_SuperDuty:0x0000D104r; // "DTM_transmission" //
		stock_parts_list_E[5] = parts.engines.MC_Prime_SuperDuty:0x00000083r; // "DLH_flywheel" //
		stock_parts_list_E[6] = parts.engines.MC_Prime_SuperDuty:0x00000084r; // "DLH_clutch" //
		stock_parts_list_E[7] = parts.engines.MC_Prime_SuperDuty:0x0000009Br; // "DLH_crankshaft_bearing_bridge" //
		stock_parts_list_E[8] = parts.engines.MC_Prime_SuperDuty:0x00000095r; // "DLH_oil_pan" //
		stock_parts_list_E[9] = parts.engines.MC_Prime_SuperDuty:0x00000097r; // "DLH_alternator_drive_belt" //
		stock_parts_list_E[10] = parts.engines.MC_Prime_SuperDuty:0x00000096r; // "DLH_alternator" //
		stock_parts_list_E[11] = parts.engines.MC_Prime_SuperDuty:0x00000043r; // "DLH_camshaft_drive_belt" //
		stock_parts_list_E[12] = parts.engines.MC_Prime_SuperDuty:0x00000040r; // "DLH_L_cylinder_head" //
		stock_parts_list_E[13] = parts.engines.MC_Prime_SuperDuty:0x00000041r; // "DLH_R_cylinder_head" //
		stock_parts_list_E[14] = parts.engines.MC_Prime_SuperDuty:0x00000046r; // "DLH_L_exhaust_header" //
		stock_parts_list_E[15] = parts.engines.MC_Prime_SuperDuty:0x00000045r; // "DLH_R_exhaust_header" //
		stock_parts_list_E[16] = parts.engines.MC_Prime_SuperDuty:0x0000004Er; // "DLH_L_exhaust_camshaft" //
		stock_parts_list_E[17] = parts.engines.MC_Prime_SuperDuty:0x00000051r; // "DLH_R_exhaust_camshaft" //
		stock_parts_list_E[18] = parts.engines.MC_Prime_SuperDuty:0x0000004Dr; // "DLH_L_intake_camshaft" //
		stock_parts_list_E[19] = parts.engines.MC_Prime_SuperDuty:0x00000050r; // "DLH_R_intake_camshaft" //
		stock_parts_list_E[20] = parts.engines.MC_Prime_SuperDuty:0x0000004Fr; // "DLH_L_camshaft_bearing_bridge" //
		stock_parts_list_E[21] = parts.engines.MC_Prime_SuperDuty:0x00000052r; // "DLH_R_camshaft_bearing_bridge" //
		stock_parts_list_E[22] = parts.engines.MC_Prime_SuperDuty:0x00000042r; // "DLH_L_cylinder_head_cover" //
		stock_parts_list_E[23] = parts.engines.MC_Prime_SuperDuty:0x00000044r; // "DLH_R_cylinder_head_cover" //
		stock_parts_list_E[24] = parts.engines.MC_Prime_SuperDuty:0x0000008Ar; // "DLH_intake_manifold" //
		stock_parts_list_E[25] = parts.engines.MC_Prime_SuperDuty:0x0000008Br; // "DLH_carburetors" //
		stock_parts_list_E[26] = parts:0x000053FFr; // "stock battery" //

//=================================DTM ENGINE END

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[0] = parts:0x000000F4r; // "Baiern_GT_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[1] = parts:0x000000F5r; // "Baiern_GT_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[2] = parts:0x000000F6r; // "Baiern_GT_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[3] = parts:0x000000F7r; // "Baiern_GT_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[0] = stock_parts_list_RGear_shocks[1] = parts:0x000000ECr; // "shock_absorber_Baiern_GT_front" //
		stock_parts_list_RGear_shocks[2] = stock_parts_list_RGear_shocks[3] = parts:0x000000EDr; // "shock_absorber_Baiern_GT_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[0] = stock_parts_list_RGear_springs[1] = parts:0x000000F2r; // "spring_Baiern_GT_front" //
		stock_parts_list_RGear_springs[2] = stock_parts_list_RGear_springs[3] = parts:0x000000F3r; // "spring_Baiern_GT_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[0] = stock_parts_list_RGear_brakes[1] = parts:0x000000DAr; // "brake_Baiern_GT_front" //
		stock_parts_list_RGear_brakes[2] = stock_parts_list_RGear_brakes[3] = parts:0x000000DBr; // "brake_Baiern_GT_rear" //

		stock_parts_list_RGear_sways = new int[2];
		stock_parts_list_RGear_sways[0] = parts:0x0000021Dr; // "swaybar_Baiern_GT_front" //
		stock_parts_list_RGear_sways[1] = parts:0x0000021Er; // "swaybar_Baiern_GT_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x00000400r; // "rim Baiern_DTM 11.0 19 ET -25 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x00000400r; // "rim Baiern_DTM 13.0 19 ET -40 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x00000404r; // "tyre 255 25 19 11.0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x00000404r; // "tyre 295 20 19 13.0 LOD CATALOG GARAGE" //

		super.addStockParts( desc );
		
		addPart( parts.interior:0x00000013r, "steering wheel" ); //steering_wheel_Extreme.class
		addPart( parts.pedals:0x0000BB01r, "stock pedals manual" );

		addPart( cars.racers.Einvagen:0x0000D136r, "L_DTM_exhaust_pipe" );
		addPart( cars.racers.Einvagen:0x0000D137r, "R_DTM_exhaust_pipe" );
		addPart( cars.racers.Einvagen:0x0000D138r, "DTM_muffler" );
		addPart( cars.racers.Einvagen:0x0000D138r, "DTM_muffler" );
		addPart( cars.racers.Einvagen:0x0000D138r, "DTM_muffler" );
		addPart( cars.racers.Einvagen:0x0000D138r, "DTM_muffler" );
	}
}
