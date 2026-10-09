package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Furrano_GTS extends Furrano_models
{
	public Furrano_GTS( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Hauler's";
		vendorName = "Furrano";
		model = MODEL_GTS;
		modelName = "GTS";
		vehicleName = "Hauler's " + vendorName + " " + modelName;
		policeName = "Hauler's " + vendorName + " police car";
		name = getName();

		description = "This is a wild version of the Furrano GT54 developed and produced by Hauler's Ltd. Stock body panels have been replaced with the light aerodynamic ones which gave this car better acceleration and more agressive look. Hauler's engineers have also removed the targa top to make new sport seats fit the car. Finally, the new high-performance racing 3.0L 701HP V10 engine ensures best acceleration and speed for a Furrano GTS sportcar.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(5.690);
		brand_new_prestige_value = 38.98;
 
		fully_stripped_drag = 0.45;
		brake_balance_can_be_set = 1;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(18));
		exhaustSlotIDList.addElement(new Integer(23));

		L_stock_door_slot = 4; //stock driver's door
		R_stock_door_slot = 27; //stock passenger's door
	}

	public void addStockParts( Descriptor desc )
	{
		// stock 1 stuffs //

		stock_parts_list_E  = new int[2];
		stock_parts_list_E[0] = parts.engines.Dodge_BMW_Racing_V10:0x0000003Fr; // "Racing 9.0L V10" //
		stock_parts_list_E[1] = parts:0x000000E9r; // "silver 65ah battery" //

/*
		stock_parts_list_T  = new int[1];
		stock_parts_list_T[0] = cars.racers.Furrano:0x000000D1r; // "Targa_top" //
*/

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[0] = cars.racers.Furrano:0x000000C4r; // "F_bumper 2" //
		stock_parts_list_F[1] = cars.racers.Furrano:0x000000C2r; // "Hood 2" //
		stock_parts_list_F[2] = cars.racers.Furrano:0x000000B1r; // "F_windshield" //

		stock_parts_list_Rr = new int[3];
		stock_parts_list_Rr[0] = cars.racers.Furrano:0x000000B9r; // "R_bumper 2" //
		stock_parts_list_Rr[1] = cars.racers.Furrano:0x000000BDr; // "Trunk" //
		stock_parts_list_Rr[2] = cars.racers.Furrano:0x0000A0B2r; // "engine_window 2" //

		stock_parts_list_L  = new int[4];
		stock_parts_list_L[0] = cars.racers.Furrano:0x000000CDr; // "L_sideskirt 2" //
		stock_parts_list_L[1] = cars.racers.Furrano:0x000000C9r; // "FL_door" //
		stock_parts_list_L[2] = parts.interior:0x00000049r; // "FL seat" //
		stock_parts_list_L[3] = cars.racers.Furrano:0x000000BAr; // "L_mirror" //
//		stock_parts_list_L[4] = cars.racers.Furrano:0x000000BBr; // "L_RAM_air_intake" //

		stock_parts_list_R  = new int[4];
		stock_parts_list_R[0] = cars.racers.Furrano:0x000000CFr; // "R_sideskirt 2" //
		stock_parts_list_R[1] = cars.racers.Furrano:0x000000C0r; // "FR_door" //
		stock_parts_list_R[2] = parts.interior:0x00000049r; // "FR seat" //
		stock_parts_list_R[3] = cars.racers.Furrano:0x000000BFr; // "R_mirror" //
//		stock_parts_list_R[4] = cars.racers.Furrano:0x000000BEr; // "R_RAM_air_intake" //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[0] = parts:0x000001F4r; // "SuperDuty_500_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[1] = parts:0x000001F5r; // "SuperDuty_500_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[2] = parts:0x000001F6r; // "SuperDuty_500_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[3] = parts:0x000001F7r; // "SuperDuty_500_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[0] = stock_parts_list_RGear_shocks[1] = parts:0x000001B0r; // "shock_absorber_SuperDuty_500_front" //
		stock_parts_list_RGear_shocks[2] = stock_parts_list_RGear_shocks[3] = parts:0x000001B1r; // "shock_absorber_SuperDuty_500_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[0] = stock_parts_list_RGear_springs[1] = parts:0x000001DAr; // "spring_SuperDuty_500_front" //
		stock_parts_list_RGear_springs[2] = stock_parts_list_RGear_springs[3] = parts:0x000001DBr; // "spring_SuperDuty_500_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[0] = stock_parts_list_RGear_brakes[1] = parts:0x00000157r; // "brake_SuperDuty_500_front" //
		stock_parts_list_RGear_brakes[2] = stock_parts_list_RGear_brakes[3] = parts:0x00000158r; // "brake_SuperDuty_500_rear" //

		stock_parts_list_RGear_sways = new int[2];
		stock_parts_list_RGear_sways[0] = parts:0x0000018Fr; // "swaybar_SuperDuty_500_front" //
		stock_parts_list_RGear_sways[1] = parts:0x00000190r; // "swaybar_SuperDuty_500_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x00000316r; // rim_SL_Tuners_Grinder_8_0_18_ET_0_LOD_CATALOG_GARAGE
		stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x00000316r; // rim_SL_Tuners_Grinder_8_0_18_ET_0_LOD_CATALOG_GARAGE

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x000003D5r; // tyre_205_55_18_8_0_LOD_CATALOG_GARAGE
		stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x000003D5r; // tyre_205_55_18_8_0_LOD_CATALOG_GARAGE

		super.addStockParts( desc );

		addPart( cars.racers.Furrano:0x000000B4r, "steering_wheel" );
		addPart( parts.pedals:0x0000BB01r, "stock pedals manual" );
		addPart( cars.racers.Furrano:0x00000114r, "stock_exhaust_pipe" );

		if (desc.power > 1.25)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Dodge_BMW_Racing_V10:0x000000BFr, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.25)/0.75*0.500+0.500),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);

			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001BFr, "24pds canister" );
			
			if (desc.power > 1.6) //additional canisters
			{
				addPart( parts:0x000001C1r, "12pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
			}
		}
	}
}