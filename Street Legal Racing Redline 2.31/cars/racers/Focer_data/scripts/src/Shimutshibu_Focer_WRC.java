package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Shimutshibu_Focer_WRC extends Shimutshibu_models
{
	public Shimutshibu_Focer_WRC( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Shimutshibu Motor Company RallyCar Developers";
		vendorName = "Focer";
		model = MODEL_FOCER_WRC;
		modelName = "WRC";
		vehicleName = "Shimutshibu " + vendorName + " " + modelName;
		policeName = "Shimutshibu " + vendorName + " police car";
		name = getName();

		description = "The biggest rival for the Ishima Enula WR SuperTurizmo. It's almost the same construction, but due to its tuning and handling capabilities it's more favorized by Valo City racers than the Enula race model.";

		// easter egg: EE-RC200C on the LCD screen built into the dash //

		game_version = 2.31;

		value = mHUF2USD(6.0);
		brand_new_prestige_value = 80.0;

		fully_stripped_drag = 0.55;
		brake_balance_can_be_set = 1;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(39));
	}

	public void addStockParts( Descriptor desc )
	{
		// stock 1 stuffs //

		stock_parts_list_E  = new int[2];
		stock_parts_list_E[0] = parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F9r; // "Shimutshibu RC B95S200 2.0L I4" //
		stock_parts_list_E[1] = parts:0x000000E9r; // "silver 65ah battery" //

		stock_parts_list_T  = new int[1];
		stock_parts_list_T[0] = cars.racers.focer:0x000000C1r; // "Rf airduct" //

		stock_parts_list_FL = new int[2];
		stock_parts_list_FL[0] = cars.racers.focer:0x0000F10Cr; // "L headlights 3" //
		stock_parts_list_FL[1] = cars.racers.focer:0x0000F0AEr; // "FL quarterpanel 2" //

		stock_parts_list_FR = new int[2];
		stock_parts_list_FR[0] = cars.racers.focer:0x0000F10Dr; // "R headlights 2" //
		stock_parts_list_FR[1] = cars.racers.focer:0x0000F0B8r; // "FR quarterpanel 2" //

		stock_parts_list_RL = new int[2];
		stock_parts_list_RL[0] = cars.racers.focer:0x0000F0A5r; // "L taillights 2" //
		stock_parts_list_RL[1] = cars.racers.focer:0x0000F0B2r; // "RL quarterpanel 2" //

		stock_parts_list_RR = new int[2];
		stock_parts_list_RR[0] = cars.racers.focer:0x0000F0BBr; // "R taillights 2" //
		stock_parts_list_RR[1] = cars.racers.focer:0x0000F0B9r; // "RR quarterpanel 2" //

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[0] = cars.racers.focer:0x0000F0AFr; // "F bumper 2" //
		stock_parts_list_F[1] = cars.racers.focer:0x0000F0A4r; // "hood 2" //
		stock_parts_list_F[2] = cars.racers.focer:0x000000BDr; // "F windshield" //

		stock_parts_list_Rr = new int[4];
		stock_parts_list_Rr[0] = cars.racers.focer:0x0000F0B3r; // "R bumper 2" //
		stock_parts_list_Rr[1] = cars.racers.focer:0x000000A6r; // "trunk" //
		stock_parts_list_Rr[2] = cars.racers.focer:0x0000F0C2r; // "R wing 2" //
		stock_parts_list_Rr[3] = cars.racers.focer:0x000000A7r; // "R windshield" //

		stock_parts_list_L  = new int[7];
		stock_parts_list_L[0] = cars.racers.focer:0x0000F0B0r; // "L sideskirt 2" //
		stock_parts_list_L[1] = cars.racers.focer:0x000000A8r; // "FL door" //
		stock_parts_list_L[2] = cars.racers.focer:0x0000F0B1r; // "RL door 2" //
		stock_parts_list_L[3] = cars.racers.focer:0x000000ADr; // "FL window" //
		stock_parts_list_L[4] = cars.racers.focer:0x000000BFr; // "L mirror" //
		stock_parts_list_L[5] = cars.racers.focer:0x000000B4r; // "RL window" //
		stock_parts_list_L[6] = parts.interior:0x00000049r; // "FL seat" //

		stock_parts_list_R  = new int[7];
		stock_parts_list_R[0] = cars.racers.focer:0x0000F0BEr; // "R sideskirt 2" //
		stock_parts_list_R[1] = cars.racers.focer:0x000000B6r; // "FR door" //
		stock_parts_list_R[2] = cars.racers.focer:0x0000F0B7r; // "RR door 2" //
		stock_parts_list_R[3] = cars.racers.focer:0x000000A9r; // "FR window" //
		stock_parts_list_R[4] = cars.racers.focer:0x000000C0r; // "R mirror" //
		stock_parts_list_R[5] = cars.racers.focer:0x000000B5r; // "RR window" //
		stock_parts_list_R[6] = parts.interior:0x00000049r; // "FR seat" //

		// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[0] = parts:0x00000215r; // "Focer_WRC_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[1] = parts:0x00000216r; // "Focer_WRC_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[2] = parts:0x00000217r; // "Focer_WRC_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[3] = parts:0x00000218r; // "Focer_WRC_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[0] = stock_parts_list_RGear_shocks[1] = parts:0x000001D4r; // "shock_absorber_Focer_WRC_front" //
		stock_parts_list_RGear_shocks[2] = stock_parts_list_RGear_shocks[3] = parts:0x000001D5r; // "shock_absorber_Focer_WRC_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[0] = stock_parts_list_RGear_springs[1] = parts:0x000001EAr; // "spring_Focer_WRC_front" //
		stock_parts_list_RGear_springs[2] = stock_parts_list_RGear_springs[3] = parts:0x000001EBr; // "spring_Focer_WRC_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[0] = stock_parts_list_RGear_brakes[1] = parts:0x0000017Ar; // "brake_Focer_WRC_front" //
		stock_parts_list_RGear_brakes[2] = stock_parts_list_RGear_brakes[3] = parts:0x0000017Br; // "brake_Focer_WRC_rear" //

		stock_parts_list_RGear_sways = new int[2];
		stock_parts_list_RGear_sways[0] = parts:0x000001A7r; // "swaybar_Focer_WRC_front" //
		stock_parts_list_RGear_sways[1] = parts:0x000001A9r; // "swaybar_Focer_WRC_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x00000380r; // "rim Star_II 9.5 17 ET -30 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x00000380r; // "rim Star_II 9.5 17 ET -30 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x000003E9r; // "tyre 245 45 17 9.5 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x000003E9r; // "tyre 245 45 17 9.5 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( parts.interior:0x00000024r, "steering wheel" );
		addPart( parts.pedals:0x0000BB02r, "stock pedals auto" );

		addPart( cars.racers.Focer:0x00000295r, "turbo_exhaust_pipe" );
		addPart( parts.mufflers:0x0000000Ar, "muffler type 03" );

		if (desc.power > 1.3)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.3)/0.7*0.500+0.500),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			
			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001BFr, "24pds canister" );
		}
	}
}
