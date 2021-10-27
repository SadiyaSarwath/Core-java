package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DoctorDTO;

public class DoctorDAO {
		private DoctorDTO[] doctorDTOs = new DoctorDTO[999];
		private int doc;

		public void create(DoctorDTO dto) {
			System.out.println("invoked create");
			if (dto != null && this.doc < this.doctorDTOs.length) {
				this.doctorDTOs[this.doc++] = dto;
				System.out.println("added hospitalName :".concat(dto.getHospitalName()));
			} else {
				System.err.println("container is full or null");
			}
		}

		public void create(DoctorDTO dto, int index) {
			System.out.println("invoked create with dto and index");
			if (index < this.doctorDTOs.length && index >= 0) {
				this.doctorDTOs[index + 1] = dto;
				System.out.println("index occupied is :".concat(String.valueOf(dto.getHospitalName())));
			} else {
				System.out.println("index not occupied :".concat(String.valueOf(index)));
			}
		}

		public int indexOccupied() {
			return doc;
		}

		public boolean matchDoctorByName(String hospitalName) {
			System.out.println("invoked matchDoctorByName");
			System.out.println("hospital name passed :".concat(hospitalName));
			for (int i = 0; i < doctorDTOs.length; i++) {
				DoctorDTO ref = this.doctorDTOs[i];
				if (ref != null) {
					System.out.println("ref in index is not null :".concat(String.valueOf(i)));
					String tempName = ref.getHospitalName();
					System.out.println("matching".concat(tempName));
					if (hospitalName.equals(tempName)) {
						System.out.println("hospital name found");
						return true;
					}
				}

			}
			return false;

		}
	}


